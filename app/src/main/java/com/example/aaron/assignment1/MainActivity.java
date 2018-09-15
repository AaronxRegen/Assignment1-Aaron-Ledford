package com.example.aaron.assignment1; 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private final int MY_REQUEST = 1;
    public EditText textt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textt = findViewById(R.id.text1);
    }

    public void onClick(View view){
    Intent i = new Intent(this, Main2Activity.class);
    startActivityForResult(i, MY_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    if(resultCode == Activity.RESULT_OK) {
        textt.setText("The App is UNLOCKED!");
    }
    else
        textt.setText("The App is LOCKED!");
        }
    }