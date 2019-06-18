package com.bawei.chengjinzhu20190618;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

/**
 * Author:程金柱
 * Date:2019/6/18 20:14
 * Description：
 */

public class XrecyAdapter extends XRecyclerView.Adapter<XrecyAdapter.HandlerMy> {
    private Context context;

    public XrecyAdapter(Context context) {
        this.context = context;
    }
    private List<ShopCarBean.Result> results;

    public void setResults(List<ShopCarBean.Result> results) {
        this.results = results;
    }

    @NonNull
    @Override
    public HandlerMy onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(R.layout.item, viewGroup, false);
        return new HandlerMy(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull HandlerMy handlerMy, int i) {
        ShopCarBean.Result result = results.get(1);
        Glide.with(context).load(result.shoppingCartList.get(i).pic).into(handlerMy.img);
        handlerMy.text.setText(result.shoppingCartList.get(i).commodityName);
    }

    @Override
    public int getItemCount() {
        if (results!=null){
            return results.get(1).shoppingCartList.size();
        }
        return 0;
    }

    public class HandlerMy extends XRecyclerView.ViewHolder {

        public final ImageView img;
        public final TextView text;

        public HandlerMy(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            text = itemView.findViewById(R.id.text);

        }
    }
}
