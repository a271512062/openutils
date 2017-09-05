package com.lihaibin.openutils.base;

/**
 * 创建者     李海镔
 * 创建时间   2017/8/15 17:41
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */


import com.lihaibin.openutils.utils.LogUtils;

import rx.functions.Func1;

/**
 * 用来统一处理Http的resultCode,并将HttpResult的Data部分剥离出来返回给subscriber
 *
 * @param <T> Subscriber真正需要的数据类型，也就是Data部分的数据类型
 */
public class BaseHttpResultFunc<T> implements Func1<BaseBean<T>, T> {//<BaseBean<LoginBean>, LoginBean>
    protected OnResultOtherListener mOnResultOtherListener;
    public BaseHttpResultFunc(OnResultOtherListener onResultOtherListener) {
        mOnResultOtherListener=onResultOtherListener;
    }

    @Override
    public T call(BaseBean<T> tBaseBean) {
        LogUtils.e("ResultFunc---"+"Msg:"+tBaseBean.getMsg()+"----Code"+tBaseBean.getCode()+"----Data"+tBaseBean.getData());
        if (tBaseBean.getCode() != 1) {
            mOnResultOtherListener.onOthercode(tBaseBean.getCode());
            return null;
        }else{
            return tBaseBean.getData();
        }
    }

    public interface OnResultOtherListener{
        void onOthercode(int code);
    }
}
