package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResearchResultActivity extends AppCompatActivity {

    private String resultData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_result);
        resultData = getIntent().getStringExtra("data_2");

        TextView result = findViewById(R.id.result);

        result.setText("당신의 선택은 \n" + resultData + "\n입니다.");
    }
}