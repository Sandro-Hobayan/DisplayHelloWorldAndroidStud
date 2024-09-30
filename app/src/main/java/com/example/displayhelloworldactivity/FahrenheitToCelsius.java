package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class FahrenheitToCelsius extends AppCompatActivity {

    EditText fahrenheit, celsius;
    Button convert, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fahrenheit_to_celsius);

        fahrenheit = findViewById(R.id.et_fahrenheit);
        celsius = findViewById(R.id.et_celsius);
        convert = findViewById(R.id.btn_convert);
        clear = findViewById(R.id.btn_fahrenheitclear);


        convert.setOnClickListener(v->{
            convert();
        });

        clear.setOnClickListener(v->{
            fahrenheit.setText("");
            celsius.setText("");
        });
    }

    public void convert() {
        String fahrenheitInput = fahrenheit.getText().toString();
        String celsiusInput = celsius.getText().toString();

        if (fahrenheitInput.isEmpty() && celsiusInput.isEmpty()) {
            fahrenheit.setText("Enter value first to convert!");
        } else if (!fahrenheitInput.isEmpty()) {
            double fahrenheitValue = Double.parseDouble(fahrenheitInput);
            double celsiusValue = (fahrenheitValue - 32) / 1.8;
            celsius.setText(String.valueOf(celsiusValue));
        } else if (!celsiusInput.isEmpty()) {
            double celsiusValue = Double.parseDouble(celsiusInput);
            double fahrenheitValue = (celsiusValue * 1.8) + 32;
            fahrenheit.setText(String.valueOf(fahrenheitValue));
        }
    }

}