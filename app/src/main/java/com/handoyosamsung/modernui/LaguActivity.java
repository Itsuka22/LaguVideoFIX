package com.handoyosamsung.modernui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;


import java.io.IOException;
import java.util.ArrayList;

public class LaguActivity extends AppCompatActivity{

    private ArrayList<Music> arrayList;
    private LaguAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Love Letter", "YOASOBI", R.raw.yoasobi_lagu));
        arrayList.add(new Music("STAY", "Justin beiber", R.raw.staylagu));
        arrayList.add(new Music("UU Kaget", "H", R.raw.jokowikagetlagu));

        adapter = new LaguAdapter(this, R.layout.lagu_item, arrayList);
        songList.setAdapter(adapter);
    }

}