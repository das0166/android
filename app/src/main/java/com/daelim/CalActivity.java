package com.daelim;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalActivity extends AppCompatActivity {
    int num1;
    int temp;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        Button one = (Button)findViewById(R.id.num_1);
        Button two = (Button)findViewById(R.id.num_2);
        Button three = (Button)findViewById(R.id.num_3);
        Button four = (Button)findViewById(R.id.num_4);
        Button five = (Button)findViewById(R.id.num_5);
        Button six = (Button)findViewById(R.id.num_6);
        Button seven = (Button)findViewById(R.id.num_7);
        Button eight = (Button)findViewById(R.id.num_8);
        Button nine = (Button)findViewById(R.id.num_9);
        Button zero = (Button)findViewById(R.id.num_0);
        final Button sum = (Button)findViewById(R.id.bt_1);
        final Button sub = (Button)findViewById(R.id.bt_2);
        final Button mul = (Button)findViewById(R.id.bt_3);
        final Button equals = (Button)findViewById(R.id.bt_4);
        final Button percent = (Button)findViewById(R.id.bt_5);
        final Button ave = (Button)findViewById(R.id.bt_6);

        final TextView tv = (TextView) findViewById(R.id.textView);
        View.OnClickListener ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = (String) tv.getText();
                text += ((Button) v).getText();
                tv.setText(text);
            }
        };

        one.setOnClickListener(ClickListener);
        two.setOnClickListener(ClickListener);
        three.setOnClickListener(ClickListener);
        four.setOnClickListener(ClickListener);
        five.setOnClickListener(ClickListener);
        six.setOnClickListener(ClickListener);
        seven.setOnClickListener(ClickListener);
        eight.setOnClickListener(ClickListener);
        nine.setOnClickListener(ClickListener);
        zero.setOnClickListener(ClickListener);

        View.OnClickListener calcul = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == sum) {
                    String text = (String) tv.getText();
                    num1 = Integer.parseInt(text);
                    temp = 1;
                    tv.setText("");
                } else if (v == sub) {
                    String text = (String) tv.getText();
                    num1 = Integer.parseInt(text);
                    temp = 2;
                    tv.setText("");
                } else if (v == mul) {
                    String text = (String) tv.getText();
                    num1 = Integer.parseInt(text);
                    temp = 3;
                    tv.setText("");
                } else if (v == percent) {
                    String text = (String) tv.getText();
                    num1 = Integer.parseInt(text);
                    temp = 4;
                    tv.setText("");
                } else if (v == ave) {
                    String text = (String) tv.getText();
                    num1 = Integer.parseInt(text);
                    temp = 5;
                    tv.setText("");
                } else if (v == equals) {
                    if (temp == 1) {
                        result = num1 + Integer.valueOf(tv.getText().toString());
                        tv.setText(String.valueOf(result));
                    } else if (temp == 2) {
                        result = num1 - Integer.valueOf(tv.getText().toString());
                        tv.setText(String.valueOf(result));
                    } else if (temp == 3) {
                        result = num1 * Integer.valueOf(tv.getText().toString());
                        tv.setText(String.valueOf(result));
                    } else if (temp == 4) {
                        result = num1 % Integer.valueOf(tv.getText().toString());
                        tv.setText(String.valueOf(result));
                    } else if (temp == 5) {
                        result = num1 / Integer.valueOf(tv.getText().toString());
                        tv.setText(String.valueOf(result));
                    }
                }
            }
        };
        sum.setOnClickListener(calcul);
        equals.setOnClickListener(calcul);
        sub.setOnClickListener(calcul);
        ave.setOnClickListener(calcul);
        mul.setOnClickListener(calcul);
        percent.setOnClickListener(calcul);
    }
}