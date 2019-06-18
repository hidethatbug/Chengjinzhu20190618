package com.bawei.chengjinzhu20190618;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.jcodecraeer.xrecyclerview.XRecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity implements HomeContract.HomeView {

    private HomeContract.HomePresenter homePresenter;
    private Unbinder bind;
    @BindView(R.id.recy_home)
    XRecyclerView xRecyclerView;
    @BindView(R.id.jsss)
    Button jsss;
    private XrecyAdapter xrecyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        bind = ButterKnife.bind(this);
        homePresenter=new HomePresenterImpl();
        homePresenter.bind(this);
        homePresenter.getData();
        xRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        xrecyAdapter = new XrecyAdapter(this);
        xRecyclerView.setAdapter(xrecyAdapter);
        jsss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
        homePresenter.undind();
    }

    @Override
    public void getData(Object o) {
        ShopCarBean shopCarBean= (ShopCarBean) o;
        String message = shopCarBean.message;
        xrecyAdapter.setResults(shopCarBean.result);

    }
}
