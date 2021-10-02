package com.handoyosamsung.modernui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonvideo, buttonlagu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        inisialisasi
        buttonvideo = findViewById(R.id.btn_video);
        buttonlagu = findViewById(R.id.btn_lagu);

        buttonvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VidActivity();

            }
        });

        buttonlagu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LagActivity();

            }
        });


    }
    public void VidActivity() {
        Intent intent = new Intent(MainActivity.this, VideoActivity.class);
        startActivity(intent);
    }

    public void LagActivity(){
        Intent intent = new Intent(MainActivity.this, LaguActivity.class);
        startActivity(intent);
    }



}