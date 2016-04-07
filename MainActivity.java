package com.example.aa.douaiismine_test;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        MediaPlayer m = MediaPlayer.create(this,R.raw.fr_40011);
        m.start();
        m = MediaPlayer.create(this,R.raw.fr_40006);
        m.start();
    }
    public void startEvents(View view){
        Intent intent = new Intent(this, events.class);
        /**intent.putExtra(VALUE, "Circuits");*/    /** Pour creer un Popup : c'est moche */
        startActivity(intent);
    }
    public void startCircuits(View view){
        Intent intent = new Intent(this, circuits.class);
        /**intent.putExtra(VALUE, "Circuits");*/    /** Pour creer un Popup : c'est moche */
        startActivity(intent);
    }
    public void startIP(View view){
        Intent intent = new Intent(this, IP.class);
        startActivity(intent);
    }
    public void startLav(View view){
        Intent intent = new Intent(this, lav.class);
        /**intent.putExtra(VALUE, "Circuits");*/    /** Pour creer un Popup : c'est moche */
        startActivity(intent);
    }
}
