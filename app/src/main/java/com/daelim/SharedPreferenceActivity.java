package com.daelim;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SharedPreferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        Button save = findViewById(R.id.save);
        Button check = findViewById(R.id.check);
        EditText input = findViewById(R.id.input);
        SharedPreferences sp=getSharedPreferences("name", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

    save.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            editor.putString("text", input.getText().toString());
            editor.commit();
            input.setText("");
        }
    });
    check.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String s = sp.getString("text","");
            AlertDialog.Builder ab = new AlertDialog.Builder(SharedPreferenceActivity.this)
                    .setTitle("알람")
                    .setMessage(s)
                    .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
            AlertDialog ad = ab.create();
            ad.show();
        }
    });
    }
}