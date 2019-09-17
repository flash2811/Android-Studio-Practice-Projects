package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view){
        int id = view.getId();
        String ourId = "";
        ourId = view.getResources().getResourceEntryName(id);

        int resourseID = getResources().getIdentifier(ourId, "raw", "com.example.basicphrases");

        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourseID);
        mediaPlayer.start();

        Log.i("Button tapped", ourId);

    }
}
