package com.example.testappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity3 extends AppCompatActivity {
         RadioGroup radioGroup;
         RadioButton radioButton1,radioButton2,radioButton3;
         CheckBox checkBox1,checkBox2,checkBox3;
         ArrayList<String> result;
         Button rButton;
         TextView rview;
         Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        initial();
    }
    void initial(){
        radioGroup=findViewById(R.id.radioGroup);
        radioButton1=findViewById(R.id.radioButton1);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);
        checkBox1=findViewById(R.id.cb1);
        checkBox1=findViewById(R.id.cb1);
        checkBox1=findViewById(R.id.cb1);
        rButton=findViewById(R.id.resultBtn);
        rview=findViewById(R.id.resultView);
        result = new ArrayList<String>();
        next=findViewById(R.id.buttonNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
    }
    void openActivity4(){
        Intent intent=new Intent(this,Activity4.class);
        startActivity(intent);
    }

    void click(){
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButton1.isChecked()){
                       result.add("Mech");
                }else{
                      result.remove("Mech");
                }
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButton2.isChecked()){
                    result.add("EEE");
                }else{
                   result.remove("EEE");
                }
            }
        });
        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButton3.isChecked()){
                      result.add("ECE");
                }else{
                      result.remove("ECE");
                }
            }
        });
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox1.isChecked()){
                    result.add("JAVA");
                }else{
                    result.remove("JAVA");
                }
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox2.isChecked()){
                     result.add("Python");
                }else{
                     result.remove("Python");
                }
            }
        });
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox3.isChecked()){
                   result.add("Android Development");
                }else{
                    result.remove("Android Development");
                }
            }
        });
        rButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                for(String s:result){
                    stringBuilder.append(s).append("\n");
                    rview.setText(stringBuilder.toString());
                    rview.setEnabled(false);

                }
            }
        });
    }
}