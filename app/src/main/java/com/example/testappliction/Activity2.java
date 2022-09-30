package com.example.testappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private int prog=0;
    private ProgressBar progressBar;
    TextView age =findViewById(R.id.age);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button button_inc = (Button) findViewById(R.id.button_Increase);
        Button button_dec =(Button) findViewById(R.id.button_decrease);
        updateProgressBar();
        button_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prog<=90){
                    prog=prog+10;
                    updateProgressBar();
                }
            }
        });
        button_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(prog>=10){
                    prog=prog-10;
                    updateProgressBar();

                }
            }
        });
    }
    public void updateProgressBar(){
        progressBar.setProgress(prog);
        age.setText(prog);
    }
}