package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class Activity6 extends AppCompatActivity {

    TextView output;
    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_6);

        output = findViewById(R.id.tv_6output);
        input = findViewById(R.id.et_6input);
        submit = findViewById(R.id.btn_6submit);

        submit.setOnClickListener(v ->{
            toGetAge();
        });

    }

    private void toGetAge(){
        try {
            int birthYear = Integer.parseInt(input.getText().toString());
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int age = currentYear - birthYear;

            output.setText(age + " Years of old");

        }catch (Exception e){
            output.setText("Put your birth year (e.g., 1990)");
        }
    }
}