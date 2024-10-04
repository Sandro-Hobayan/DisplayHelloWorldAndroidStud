package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class randomNumberGenerator extends AppCompatActivity {

    TextView output;
    EditText minimumInput, maximumInput;
    Button generate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_random_number_generator);

        output = findViewById(R.id.tv_randomNumGenOutput);
        minimumInput = findViewById(R.id.et_randomNumGenMinimum);
        maximumInput = findViewById(R.id.et_randomNumGenMaximum);
        generate = findViewById(R.id.btn_randomNumGenGenerate);

        generate.setOnClickListener(v -> {
            try {
                int min = Integer.parseInt(minimumInput.getText().toString());
                int max = Integer.parseInt(maximumInput.getText().toString());

                int randomNum = (int) (Math.random() * (max - min + 1)) + min;

                output.setText(String.valueOf(randomNum));
            } catch (NumberFormatException e) {
                output.setText("Enter valid integer values for minimum and maximum");
            }
        });
    }
}
