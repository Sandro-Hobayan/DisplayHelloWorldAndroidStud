package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Activity8 extends AppCompatActivity {

    TextView output;
    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_8);

        output = findViewById(R.id.tv_8output);
        input = findViewById(R.id.et_8input);
        submit = findViewById(R.id.btn_8submit);

        submit.setOnClickListener(v ->{
            oddEvenChecker();
        });
    }
    public void oddEvenChecker(){
        int num = Integer.parseInt(input.getText().toString());
        if(num % 2 == 0){
            String result = "even";
            output.setText(num + " is " + result);
        }else{
            String result = "odd";
            output.setText(num + " is " + result);
        }
    }
}