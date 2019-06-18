package com.bawei.chengjinzhu20190618;

/**
 * Author:程金柱
 * Date:2019/6/18 19:43
 * Description：
 */

public interface HomeContract {
    interface HomeModel{
        void getData(DataCallBack dataCallBack);
    }
    interface HomeView{
        void getData(Object o);
    }
    interface HomePresenter{
        void getData();
        void bind(HomeView homeView);
        void undind();
    }
}
