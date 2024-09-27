package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class textLength extends AppCompatActivity {

    TextView output;
    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_text_length);

        output = findViewById(R.id.tv_textLengthOutput);
        input = findViewById(R.id.et_textLengthInput);
        submit = findViewById(R.id.btn_textlengthSubmit);

        submit.setOnClickListener(v ->{
            textLength();
        });
    }

    public void textLength(){
        String text = input.getText().toString();
        int length = text.length();
        output.setText(String.valueOf(length));
    }
}