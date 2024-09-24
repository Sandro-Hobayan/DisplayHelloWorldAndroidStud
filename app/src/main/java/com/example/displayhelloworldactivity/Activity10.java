package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Activity10 extends AppCompatActivity {

    TextView output;
    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_10);
        output = findViewById(R.id.tv_10output);
        input = findViewById(R.id.et_10input);
        submit = findViewById(R.id.btn_10submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = input.getText().toString().toLowerCase();                        //convert wodrs to lowercase
                String reversedInput = new StringBuilder(userInput).reverse().toString();

                if (userInput.equals(reversedInput)) {
                    output.setText("It's a palindrome!");
                } else {
                    output.setText("Not a palindrome.");
                }
            }
        });
    }
}
