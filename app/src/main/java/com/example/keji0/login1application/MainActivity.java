package com.example.keji0.login1application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {
    private ImageButton btn_qq;
    private ImageButton btn_wx;
    private ImageButton btn_wy;
    private TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        getWindow().setBackgroundDrawableResource(R.drawable.bg_main);

        btn_qq=(ImageButton)findViewById(R.id.btn_qq);
        btn_wx=(ImageButton)findViewById(R.id.btn_wx);
        btn_wy=(ImageButton)findViewById(R.id.btn_wy);
        text3=(TextView)findViewById(R.id.text3);

        btn_qq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
            }
        });
        btn_wx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
            }
        });
        btn_wy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
            }
        });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
            }
        });
    }
}
