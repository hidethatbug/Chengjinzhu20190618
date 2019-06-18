package com.bawei.chengjinzhu20190618;

/**
 * Author:程金柱
 * Date:2019/6/18 20:05
 * Description：
 */

public class HomeModelImpl implements HomeContract.HomeModel {
    @Override
    public void getData(DataCallBack dataCallBack) {
        HttpUtile.httpUtile().getData(dataCallBack);
    }
}
