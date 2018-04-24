package com.self.khetan.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Create a Global Object for the Music playback
    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //To initate the mediaplayer object i.e, mPlayer
        mPlayer = MediaPlayer.create(this, R.raw.chal);

        //Setting up button's Objects
        Button play = (Button) findViewById(R.id.playButton);
        Button pause = (Button) findViewById(R.id.pauseButton);

        //Playing the song when play button is clicked
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               mPlayer.start();
                Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
            }
        });

        //Playing the song when play button is clicked
        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mPlayer.pause();
                Toast.makeText(MainActivity.this,"Pause", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPlayer.stop();
    }
}
