package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class multiplication extends AppCompatActivity {

    TextView output1, output2, output3, output4, output5, output6, output7, output8, output9, output10;
    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiplication);

        output1 = findViewById(R.id.tv_multiplication1);
        output2 = findViewById(R.id.tv_multiplication2);
        output3 = findViewById(R.id.tv_multiplication3);
        output4 = findViewById(R.id.tv_multiplication4);
        output5 = findViewById(R.id.tv_multiplication5);
        output6 = findViewById(R.id.tv_multiplication6);
        output7 = findViewById(R.id.tv_multiplication7);
        output8 = findViewById(R.id.tv_multiplication8);
        output9 = findViewById(R.id.tv_multiplication9);
        output10 = findViewById(R.id.tv_multiplication10);

        input = findViewById(R.id.et_multiplicationInput);
        submit = findViewById(R.id.btn_multiplicationSubmit);

        submit.setOnClickListener(v ->{
            multiply();
        });
    }

    public void multiply(){
        int num = Integer.parseInt(input.getText().toString());
        int multiply = num * 1; output1.setText(String.valueOf(num + " x 1 = " + multiply));
        int multiply2 = num * 2; output2.setText(String.valueOf(num + " x 2 = " + multiply2));
        int multiply3= num * 3; output3.setText(String.valueOf(num + " x 3 = " + multiply3));
        int multiply4 = num * 4; output4.setText(String.valueOf(num + " x 4 = " + multiply4));
        int multiply5 = num * 5; output5.setText(String.valueOf(num + " x 5 = " + multiply5));
        int multiply6 = num * 6; output6.setText(String.valueOf(num + " x 6 = " + multiply6));
        int multiply7 = num * 7; output7.setText(String.valueOf(num + " x 7 = " + multiply7));
        int multiply8 = num * 8; output8.setText(String.valueOf(num + " x 8 = " + multiply8));
        int multiply9 = num * 9; output9.setText(String.valueOf(num + " x 9 = " + multiply9));
        int multiply10 = num * 10; output10.setText(String.valueOf(num + " x 10 = " + multiply10));
    }
}