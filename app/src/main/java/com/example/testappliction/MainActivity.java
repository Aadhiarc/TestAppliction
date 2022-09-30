package com.example.testappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openActivity2();
            }
        });

    }
    //Method to open the second activity
    void openActivity2(){
        EditText editText =(EditText)findViewById(R.id.userName);
        String username = editText.getText().toString();
        EditText editText2 = (EditText)findViewById(R.id.passWord);

        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }
}