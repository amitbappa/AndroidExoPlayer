package com.demo.androidexoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.SparseArray;

import com.google.android.exoplayer2.ui.PlayerView;

public class MainActivity extends AppCompatActivity {
    // Replace video id with your video Id
    private String BASE_URL = "https://990092b99d2a.ngrok.io/video";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        extractYoutubeUrl();
    }

    private void extractYoutubeUrl() {

        playVideo("https://990092b99d2a.ngrok.io/video");

    }

    private void playVideo(String downloadUrl) {
        PlayerView mPlayerView = findViewById(R.id.mPlayerView);
        mPlayerView.setPlayer(ExoPlayerManager.getSharedInstance(MainActivity.this).getPlayerView().getPlayer());
        ExoPlayerManager.getSharedInstance(MainActivity.this).playStream(downloadUrl);
    }
}
