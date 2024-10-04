package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class guessTheNumberGame extends AppCompatActivity {

    TextView output;
    EditText input;
    Button guess;

    private int rightNum = 69;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_guess_the_number_game);

        output = findViewById(R.id.tv_guessNumOutput);
        input = findViewById(R.id.et_guessnumInput);
        guess = findViewById(R.id.btn_guessNumSubmit);

        guess.setOnClickListener(v->{
            try{
                int inputValue = Integer.parseInt(input.getText().toString());

                if(inputValue < rightNum){
                    output.setText("Your guess is lower");
                } else if (inputValue > rightNum) {
                    output.setText("Your guess is higher");
                }else if(inputValue == rightNum){
                    output.setText("Oh! Yes! your guess is correct!");
                }

            }catch(NumberFormatException e){
                output.setText("Enter a valid integer as your guess");
            }
        });
    }
}