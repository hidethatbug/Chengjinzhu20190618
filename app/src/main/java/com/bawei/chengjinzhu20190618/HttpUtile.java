package com.bawei.chengjinzhu20190618;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Author:程金柱
 * Date:2019/6/18 19:44
 * Description：
 */

public class HttpUtile {
   private static HttpUtile httpUtile;
    private final Retrofit build1;

    private HttpUtile(){
       OkHttpClient build = new OkHttpClient.Builder()
               .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
               .build();
        build1 = new Retrofit.Builder().baseUrl("http://172.17.8.100/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(build)
                .build();
   }
   public static HttpUtile httpUtile(){
       if (httpUtile==null){
           synchronized (HttpUtile.class){
               if (httpUtile==null){
                   httpUtile=new HttpUtile();
               }
           }
       }
       return httpUtile;
   }
    public void getData(final DataCallBack dataCallBack){
        ShopInfo shopInfo = build1.create(ShopInfo.class);
        shopInfo.getData("6396","15607457450046396").observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<ShopCarBean>() {
                    @Override
                    public void accept(ShopCarBean shopCarBean) throws Exception {
                    dataCallBack.succes(shopCarBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                    }
                });

    }

}
