package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText rupeeAmountEditText = (EditText) findViewById(R.id.rupeeAmountEditText);

        Double rupeeAmountDouble = Double.parseDouble(rupeeAmountEditText.getText().toString());
        Double dollarAmount = rupeeAmountDouble * 0.015;

        Toast.makeText(MainActivity.this, "$" + String.format("%.2f",dollarAmount), Toast.LENGTH_SHORT).show();

        Log.i("amount", rupeeAmountEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
