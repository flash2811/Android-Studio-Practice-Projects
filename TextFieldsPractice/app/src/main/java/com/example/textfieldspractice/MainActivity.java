package com.example.textfieldspractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void logInClicked (View view){

        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText PassowordEditText = (EditText) findViewById(R.id.PasswordEditText);

        Log.i("Username", usernameEditText.getText().toString());
        Toast.makeText(MainActivity.this, "Hi " + usernameEditText.getText().toString() + "!", Toast.LENGTH_SHORT).show();


        Log.i("Password", PassowordEditText.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
