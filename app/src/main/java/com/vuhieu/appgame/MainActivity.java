package com.vuhieu.appgame;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mediaPlayer;
   ImageView imgSoud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataBase dataBase = new DataBase(MainActivity.this);
        dataBase.createDataBase();

        imgSoud= findViewById(R.id.imgsoud);
        mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.ngauhung);
        mediaPlayer.start();


}
}
