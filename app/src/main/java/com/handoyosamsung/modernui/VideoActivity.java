package com.handoyosamsung.modernui;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.RadioGroup;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    //Deklarasi Variable
    private VideoView videoView;
    private MediaController mediaController;
    private Button playVideo;
    private RadioGroup layoutvideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        //Inisialisasi VideoView, MediaController dan Button
        videoView = findViewById(R.id.video);
//        playVideo = findViewById(R.id.play);
        mediaController = new MediaController(this);

        layoutvideo = findViewById(R.id.layout_video);
        layoutvideo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.videofirst:
                        //Variable Uri untuk menentukan lokasi Resource Video yang akan ditampilkan
                        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.jokowikaget);
                        videoView.setVideoURI(uri);
                        //Memasang MediaController untuk menampilkan tombol play, pause, dsb
                        videoView.setMediaController(mediaController);
                        mediaController.setAnchorView(videoView);
                        //Menjalankan Video
                        videoView.start();
                        break;
                    case R.id.videokedua:

                        Uri dua = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.tsukihime_video);
                        videoView.setVideoURI(dua);

                        videoView.setMediaController(mediaController);
                        mediaController.setAnchorView(videoView);

                        videoView.start();
                        break;
                    case R.id.videoketiga:

                        Uri tiga = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.stay);
                        videoView.setVideoURI(tiga);

                        videoView.setMediaController(mediaController);
                        mediaController.setAnchorView(videoView);

                        videoView.start();
                        break;
                }
            }
        });



        //Menjalankan Video saat tombol Play di Klik
//        playVideo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                //Variable Uri untuk menentukan lokasi Resource Video yang akan ditampilkan
//                Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.jokowikaget);
//                videoView.setVideoURI(uri);
//                //Memasang MediaController untuk menampilkan tombol play, pause, dsb
//                videoView.setMediaController(mediaController);
//                mediaController.setAnchorView(videoView);
//                //Menjalankan Video
//                videoView.start();
//            }
//        });
    }
}