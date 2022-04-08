package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ResearchThirdActivity extends AppCompatActivity {

    private String thirdData;
    private String str="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_third);

        thirdData = getIntent().getStringExtra("data_1");
        Button bt_result = findViewById(R.id.bt_result);
        CheckBox country1 = findViewById(R.id.country1);
        CheckBox country2 = findViewById(R.id.country2);
        CheckBox country3 = findViewById(R.id.country3);
        CheckBox country4 = findViewById(R.id.country4);
        CheckBox country5 = findViewById(R.id.country5);

        bt_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(country1.isChecked()){
                    str = str + ", 아시아";
                }
                if(country2.isChecked()){
                    str = str + ", 아프리카";
                }
                if(country3.isChecked()){
                    str = str + ", 유럽";
                }
                if(country4.isChecked()){
                    str = str + ", 아메리카";
                }
                if(country5.isChecked()){
                    str = str + ", 오세아니아";
                }
                thirdData = thirdData+str;
                Intent intent = new Intent(ResearchThirdActivity.this,ResearchResultActivity.class);
                intent.putExtra("data_2",thirdData);
                startActivity(intent);
                finish();
            }
        });
    }
}