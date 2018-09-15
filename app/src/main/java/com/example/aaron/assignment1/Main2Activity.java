package com.example.aaron.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText userCode;
    private String code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        userCode = findViewById(R.id.userPassword);

    }

    public void passwordSet(View view)
    {
        Intent intent = new Intent(this,  MainActivity.class);
        if(view.getId() == R.id.button1)
            userCode.append("1");
        if(view.getId() == R.id.button2)
            userCode.append("2");
        if(view.getId() == R.id.button3)
            userCode.append("3");
        if(view.getId() == R.id.button4)
            userCode.append("4");
        code = userCode.getText().toString();
        if(view.getId() == R.id.checkPass) {
            if (code.equals("1234")) {
                setResult(Activity.RESULT_OK, intent);
            }
            else
            {
                setResult(Activity.RESULT_CANCELED, intent);
            }
            finish();
        }
    }
}
