package com.bawei.chengjinzhu20190618.bad;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bawei.chengjinzhu20190618.R;

public class Main3Activity extends AppCompatActivity {

    private Button shangchuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        shangchuan = findViewById(R.id.shangchuan);
        shangchuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivityForResult(new Intent(Main3Activity.this, Main4Activity.class), 1);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}
