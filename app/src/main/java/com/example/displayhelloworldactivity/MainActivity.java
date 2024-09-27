package com.example.displayhelloworldactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button act2, act3, act4, act5, act6, act7, act8, act9, act10, textLength, currencyConverter, wordReverser, multiplication, login;

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
        textLength = findViewById(R.id.btn_textlength);
        currencyConverter = findViewById(R.id.btn_currencyConverter);
        wordReverser = findViewById(R.id.btn_wordReverser);
        multiplication = findViewById(R.id.btn_multiplication);
        login = findViewById(R.id.btn_simpleLogin);

        String hello = "Hello World!";
        textView.setText(hello);

        act2.setOnClickListener(v -> {
           Intent act2 = new Intent(MainActivity.this, Activity2.class);
           startActivity(act2);
        });

        act3.setOnClickListener(v ->{
            Intent act3 = new Intent(MainActivity.this, Activity3.class);
            startActivity(act3);
        });

        act4.setOnClickListener(v ->{
            Intent act4 = new Intent(MainActivity.this, Activity4.class);
            startActivity(act4);
            startActivity(act4);
        });

        act5.setOnClickListener(v ->{
            Intent act5 = new Intent(MainActivity.this, Activity5.class);
            startActivity(act5);
        });

        act6.setOnClickListener(v ->{
            Intent act6 = new Intent(MainActivity.this, Activity6.class);
            startActivity(act6);
        });

        act7.setOnClickListener(v ->{
            Intent act7 = new Intent(MainActivity.this, Activity7.class);
            startActivity(act7);
        });

        act8.setOnClickListener(v ->{
            Intent act8 = new Intent(MainActivity.this, Activity8.class);
            startActivity(act8);
        });

        act9.setOnClickListener(v ->{
            Intent act9 = new Intent(MainActivity.this, Activity9.class);
            startActivity(act9);
        });

        act10.setOnClickListener(v ->{
            Intent act10 = new Intent(MainActivity.this, Activity10.class);
            startActivity(act10);
        });

        textLength.setOnClickListener(v ->{
            Intent textlength = new Intent(MainActivity.this, textLength.class);
            startActivity(textlength);
        });

        currencyConverter.setOnClickListener(v ->{
            Intent currencyConverter = new Intent(MainActivity.this, currencyConverter.class);
            startActivity(currencyConverter);
        });

        wordReverser.setOnClickListener(v ->{
            Intent wordReverser = new Intent(MainActivity.this, wordReverser.class);
            startActivity(wordReverser);
        });

        multiplication.setOnClickListener(v ->{
            Intent multiplication = new Intent(MainActivity.this, multiplication.class);
            startActivity(multiplication);
        });

        login.setOnClickListener(v ->{
            Intent login = new Intent(MainActivity.this, login.class);
            startActivity(login);
        });

    }
}