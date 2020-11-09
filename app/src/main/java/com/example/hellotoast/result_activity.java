package com.example.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class result_activity extends AppCompatActivity {
    TextView num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        Intent intent = getIntent();
        num = findViewById(R.id.text2);
        String text = intent.getStringExtra("textA");
        num.setText(text);


    }
}
