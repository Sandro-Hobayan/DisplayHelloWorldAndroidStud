package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    TextView output;
    EditText input;
    Button submit, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_3);

        output = findViewById(R.id.tv_3output);
        input = findViewById(R.id.et_3input);
        submit = findViewById(R.id.btn_3submit);
        clear = findViewById(R.id.btn_3clear);



        submit.setOnClickListener(v ->{
            String inputValue;
            inputValue = input.getText().toString();
            output.setText("Hello " + inputValue + "!");
        });

        clear.setOnClickListener(v ->{
            output.setText("");
        });

    }
}