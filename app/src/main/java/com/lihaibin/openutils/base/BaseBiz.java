package com.lihaibin.openutils.base;


import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 创建者     李海镔
 * 创建时间   2017/8/16 10:02
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */

public abstract class BaseBiz<T> extends Subscriber<T> implements BaseHttpResultFunc.OnResultOtherListener {
    //父类
    public void subscribe(Observable<BaseBean<T>> baseBeanObservable){
        baseBeanObservable.map(new BaseHttpResultFunc<T>(this))
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this);
    }

    /**
     * 只是预防特殊需要处理情况
     * @param code code为服务器返回码
     */
    @Override
    public void onOthercode(int code) {

    }
}
