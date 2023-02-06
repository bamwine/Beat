package com.beat.innocat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class Lauch extends AppCompatActivity {


    private ImageView im;

    Thread   timer;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lauch);
        setTitle("");
        im =(ImageView)findViewById(R.id.imageView1);


        Glide.with(this)
                .load("file:///android_asset/animated.gif").asGif()
                .placeholder(R.drawable.beats)
                .error(R.drawable.beats)
                .into(im);


        player =  MediaPlayer.create(Lauch.this,R.raw.beat);
        player.start();
        timer  = new Thread(){

            @Override
            public void run() {
                // super.run();
                try {
                    sleep(5000);

                }catch (Exception e){}finally {

                    startActivity(new Intent(Lauch.this,Drawer.class));

                }

            }
        };
        timer.start();

    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        player.start();

    }
}
