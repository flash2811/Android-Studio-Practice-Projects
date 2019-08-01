package com.example.animationspractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    public void fade2(View view){
//        ImageView chimchar = (ImageView) findViewById(R.id.chimchar);
//
//        ImageView monferno = (ImageView) findViewById(R.id.monferno);
//
//
//        chimchar.animate().alpha(0f).setDuration(2000);
//
//        monferno.animate().alpha(1f).setDuration(2000);
//    }

    public void fade(View view){
        ImageView monferno = (ImageView) findViewById(R.id.monferno);

        ImageView infernape = (ImageView) findViewById(R.id.infernape);

            monferno.animate().alpha(0f).setDuration(2000);

            infernape.animate().alpha(1f).setDuration(2000);

//            Toast.makeText(getApplicationContext(),"Yo", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView chimchar = (ImageView) findViewById(R.id.chimchar);

        ImageView monferno = (ImageView) findViewById(R.id.monferno);

        chimchar.animate().alpha(0f).setDuration(2000);

        monferno.animate().alpha(1f).setDuration(2000);


        //ImageView monferno = (ImageView) findViewById(R.id.monferno);
        //monferno.setAlpha(0f);
    }
}
