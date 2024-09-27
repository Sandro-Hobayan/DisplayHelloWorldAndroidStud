package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class currencyConverter extends AppCompatActivity {

    TextView output;
    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_currency_converter);

        output = findViewById(R.id.tv_currencyConverterOutput);
        input = findViewById(R.id.et_currencyConverterInput);
        submit = findViewById(R.id.btn_currencyConverterSubmit);

        submit.setOnClickListener(v ->{
            currencyConverter();
        });
    }

    public  void currencyConverter(){
        double exchangeRate = 56.0;
        double dollarAmount = Double.parseDouble(input.getText().toString());

        double converted = dollarAmount * exchangeRate;
        output.setText(converted + " to Peso");
    }
}