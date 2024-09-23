package com.example.displayhelloworldactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button act2, act3, act4, act5, act6, act7, act8, act9, act10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_hello);
        act2 = findViewById(R.id.btn_act2);
        act3 = findViewById(R.id.btn_act3);
        act4 = findViewById(R.id.btn_act4);
        act5 = findViewById(R.id.btn_act5);
        act6 = findViewById(R.id.btn_act6);
        act7 = findViewById(R.id.btn_act7);
        act8 = findViewById(R.id.btn_act8);
        act9 = findViewById(R.id.btn_act9);
        act10 = findViewById(R.id.btn_act10);

        act2.setOnClickListener(view -> {
           Intent intent = new Intent(MainActivity.this, Activity2.class);
           startActivity(intent);
        });



    }
}