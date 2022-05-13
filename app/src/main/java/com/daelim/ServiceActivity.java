package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.java_websocket.WebSocket;

public class ServiceActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MusicServiceTest";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        Button start = findViewById(R.id.start);
        Button finish = findViewById(R.id.finish);
        start.setOnClickListener(this);
        finish.setOnClickListener(this);
    }

    @Override
    public void onClick(View src) {
        switch (src.getId()) {
            case R.id.start:
                Log.d(TAG, "onClick() start ");
                startService(new Intent(this, MusicService.class));
                break;

            case R.id.finish:
                Log.d(TAG, "onClick() finish");
                stopService(new Intent(this, MusicService.class));
                break;
        }
    }


}