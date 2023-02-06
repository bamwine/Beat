package com.beat.innocat;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;

public class Rl extends AppCompatActivity {

    private ImageButton btnPlay;
    private MediaPlayer  mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rl);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");
        btnPlay = (ImageButton) findViewById(R.id.btnPlay);
        // Mediaplayer
        mp = new MediaPlayer();




        btnPlay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // check for already playing
                if(mp.isPlaying()){
                    if(mp!=null){
                        mp.pause();
                        // Changing button image to play button
                        btnPlay.setImageResource(R.drawable.btn_play);
                    }
                }else{
                    // Resume song
                    if(mp!=null){
                        mp.reset();
                        try {
                            //mp.setDataSource(""+R.string.url);
                            mp.setDataSource(_.URL);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            mp.prepare();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        mp.start();
                        // Changing button image to pause button
                        btnPlay.setImageResource(R.drawable.stop);
                    }
                }

            }
        });




    }
}
