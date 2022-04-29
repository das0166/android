package com.daelim;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init = this;
    }

    private MainActivity Init;
    @Override
    protected void onStart(){
        super.onStart();
        Button bu_cal = findViewById(R.id.cacul);
        Button bu_nex = findViewById(R.id.next);
        Button bt_go_research = findViewById(R.id.bt_go_research);
        Button bt_list = findViewById(R.id.bt_list);
        Button bt_custom = findViewById(R.id.bt_custom);
        Button bt_shared = findViewById(R.id.bt_shared);
        Button bt_call = findViewById(R.id.bt_call);
        Button bt_web = findViewById(R.id.bt_web);
        bu_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bu_nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, NextActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bt_go_research.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ResearchActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bt_list.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bt_custom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListCustomActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bt_shared.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SharedPreferenceActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bt_call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:010-2345-1234"));
                startActivity(i);
            }
        });
        bt_web.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,WebActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}