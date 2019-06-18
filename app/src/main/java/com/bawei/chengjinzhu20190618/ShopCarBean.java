package com.bawei.chengjinzhu20190618;

import java.util.List;

/**
 * Author:程金柱
 * Date:2019/6/18 19:49
 * Description：
 */

public class ShopCarBean {
    public String message;
    public String status;
    public List<Result> result;
    public class Result{
        public String categoryName;
        public List<ShoppingCartList> shoppingCartList;
        public class ShoppingCartList{
            public String commodityId;
            public String commodityName;
            public String count;
            public String pic;
            public String price;
        }
    }
}
