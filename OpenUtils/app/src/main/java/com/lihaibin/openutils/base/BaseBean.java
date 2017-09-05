package com.lihaibin.openutils.base;

import com.google.gson.annotations.SerializedName;

/**
 * 创建者     李海镔
 * 创建时间   2017/8/15 17:22
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */

public class BaseBean<T> {
    public String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int code;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @SerializedName("result")
    public T data;
}
