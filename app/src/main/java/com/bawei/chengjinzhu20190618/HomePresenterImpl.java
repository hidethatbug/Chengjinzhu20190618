package com.bawei.chengjinzhu20190618;

/**
 * Author:程金柱
 * Date:2019/6/18 20:06
 * Description：
 */

public class HomePresenterImpl implements HomeContract.HomePresenter {
    private HomeContract.HomeView homeView;
    private HomeContract.HomeModel homeModel;
    @Override
    public void getData() {
        homeModel.getData(new DataCallBack() {
            @Override
            public void succes(Object o) {
                homeView.getData(o);
            }

            @Override
            public void error() {

            }
        });
    }

    @Override
    public void bind(HomeContract.HomeView homeView) {
        this.homeView=homeView;
        homeModel=new HomeModelImpl();
    }



    @Override
    public void undind() {
    if (homeModel!=null){
        homeModel=null;
    }
    if (homeView!=null){
        homeView=null;
    }
    }
}
