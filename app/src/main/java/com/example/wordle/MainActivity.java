package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button key_Q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        key_Q = findViewById(R.id.key_Q);
        key_Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key_Q.setBackgroundColor(Color.RED);
            }
        });
    }
}