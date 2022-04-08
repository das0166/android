package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ResearchNextActivity extends AppCompatActivity {
    private String preData;
    private String str="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_researchnext);

        preData = getIntent().getStringExtra("data");
        Button bt_third = findViewById(R.id.bt_third);
        CheckBox city1 = findViewById(R.id.city1);
        CheckBox city2 = findViewById(R.id.city2);
        CheckBox city3 = findViewById(R.id.city3);
        CheckBox city4 = findViewById(R.id.city4);
        CheckBox city5 = findViewById(R.id.city5);

        bt_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(city1.isChecked()){
                    str = str + ", 서울";
                }
                if(city2.isChecked()){
                    str = str + ", 경기";
                }
                if(city3.isChecked()){
                    str = str + ", 강원";
                }
                if(city4.isChecked()){
                    str = str + ", 충남";
                }
                if(city5.isChecked()){
                    str = str + ", 충북";
                }
                preData = preData + str;
                Intent intent = new Intent(ResearchNextActivity.this,ResearchThirdActivity.class);
                intent.putExtra("data_1",preData);
                startActivity(intent);
                finish();
            }

        });
    }
}