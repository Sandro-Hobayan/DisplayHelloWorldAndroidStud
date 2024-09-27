package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class wordReverser extends AppCompatActivity {

    TextView output;
    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_word_reverser);

        output = findViewById(R.id.tv_wordReverserOutput);
        input = findViewById(R.id.et_wordReverserInput);
        submit = findViewById(R.id.btn_wordReverserSubmit);

        submit.setOnClickListener(v ->{
            reversedWord();
        });
    }

    public void reversedWord(){
        String word = input.getText().toString();
        StringBuilder reversedString = new StringBuilder(word);
        reversedString = reversedString.reverse();
        output.setText(reversedString);
    }
}