package com.example.dataapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Register extends AppCompatActivity {
    EditText name;
    Button pushButton, pullButton;
    FirebaseAuth fAuth;

    TextView pulledNames;

    DatabaseReference databaseNames;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        databaseNames = FirebaseDatabase.getInstance().getReference("names");


        name = findViewById(R.id.name);
        pushButton = findViewById(R.id.pushButton);
        pullButton = findViewById(R.id.pullButton);

        fAuth = FirebaseAuth.getInstance();

        pulledNames = findViewById(R.id.pulledNames);

        pushButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                addName();
            }

        });

        pullButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               DatabaseReference reff = FirebaseDatabase.getInstance().getReference("names");
               reff.addValueEventListener(new ValueEventListener() {
                   @Override
                   public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                       String allNames = "";
                       if (dataSnapshot.exists()) {
                           for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                               String names = dataSnapshot1.getValue(String.class); //your Object

                               //String myTitle = title.getTitle();
                               //Toast.makeText(getActivity(), "Titles: "+myTitle, Toast.LENGTH_SHORT).show();
                               allNames += "\n" + names;
                           }
                           pulledNames.setText(allNames);
                       }
                       //String id = dataSnapshot.getKey();
                       //String names = dataSnapshot.getValue(String.class);

                   }

                   @Override
                   public void onCancelled(@NonNull DatabaseError databaseError) {

                   }
               });
            }
        });
    }

    private void addName(){
        String sName = name.getText().toString().trim();

        if(!TextUtils.isEmpty(sName)){
            String id = databaseNames.push().getKey();
            databaseNames.child(id).setValue(sName);

            Toast.makeText(this, "name added", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "give a name", Toast.LENGTH_LONG).show();
        }
    }
}