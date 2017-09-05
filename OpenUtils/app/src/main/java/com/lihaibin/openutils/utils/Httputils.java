package com.lihaibin.openutils.utils;


import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 创建者     李海镔
 * 创建时间   2017/8/15 17:02
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */

public class Httputils {
    private static Retrofit mRetrofit;
    private static String  mHost;
    public static void init(String host){
        mHost=host;
        mRetrofit = new Retrofit.Builder()
                .baseUrl(host)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
    public static Retrofit getInstance(){
        return mRetrofit;
    }
}
