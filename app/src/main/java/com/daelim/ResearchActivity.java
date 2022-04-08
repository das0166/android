package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ResearchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);

        CheckBox animal1 = findViewById(R.id.animal1);
        CheckBox animal2 = findViewById(R.id.animal2);
        CheckBox animal3 = findViewById(R.id.animal3);
        CheckBox animal4 = findViewById(R.id.animal4);
        CheckBox animal5 = findViewById(R.id.animal5);

        animal1.setChecked(true);

        Button bt_next = findViewById(R.id.bt_next);
        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String str = "";
                if(animal1.isChecked()){
                    if(str.length() > 0) {
                        str = str + ", 강아지";
                    } else{
                        str = str + "강아지";
                    }
                }
                if(animal2.isChecked()){
                    if(str.length() > 0) {
                        str = str + ", 고양이";
                    } else{
                        str = str + "고양이";
                    }
                }
                if(animal3.isChecked()){
                    if(str.length() > 0) {
                        str = str + ", 소동물(햄스터, 다람쥐 등)";
                    } else{
                        str = str + "소동물(햄스터, 다람쥐 등)";
                    }
                }
                if(animal4.isChecked()){
                    if(str.length() > 0) {
                        str = str + ", 파충류(이구아나, 뱀 등)";
                    } else{
                        str = str + "파충류(이구아나, 뱀 등)";
                    }
                }
                if(animal5.isChecked()){
                    if(str.length() > 0) {
                        str = str + ", 기타(거미, 호랑이 등)";
                    } else{
                        str = str + "기타(거미, 호랑이 등)";
                    }
                }
                Intent intent = new Intent(ResearchActivity.this, ResearchNextActivity.class);
                intent.putExtra("data", str);
                startActivity(intent);
                finish();
            }
        });
    }
}