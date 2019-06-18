package com.bawei.chengjinzhu20190618;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Author:程金柱
 * Date:2019/6/18 19:47
 * Description：
 */

public interface ShopInfo {
    /**
     * rxjava转换
     * @param uid
     * @param sid
     * @return
     */
    @GET("small/order/verify/v1/findShoppingCart/")
    Observable<ShopCarBean> getData(@Header("userId")String uid,@Header("sessionId")String sid);
}
