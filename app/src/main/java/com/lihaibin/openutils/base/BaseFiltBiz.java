package com.lihaibin.openutils.base;

/**
 * 创建者     李海镔
 * 创建时间   2017/8/25 15:33
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */

public abstract class BaseFiltBiz<T> extends BaseBiz<T> {
    @Override
    public void onNext(T t) {
        if (t==null)return;
        onNonullNext(t);
    }
    public abstract void onNonullNext(T t);

}
