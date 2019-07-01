package com.example.DemoApp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        EditText myTextField = (EditText) findViewById(R.id.myTextField);

        Log.i("Info", myTextField.getText().toString());
    }

    public void clicker(View view){
        Log.i("Info","Another Button Pressed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
