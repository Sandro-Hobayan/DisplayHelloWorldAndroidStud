package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class Activity4 extends AppCompatActivity {

    TextView output;
    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_4);

        output = findViewById(R.id.tv_4output);
        input = findViewById(R.id.et_4input);
        submit = findViewById(R.id.btn_4submit);

        submit.setOnClickListener(v ->{
            counter();
        });

    }

    private void counter() {
        try {
            int x = Integer.parseInt(input.getText().toString());
            x++;
                input.setText(String.valueOf(x));
                output.setText("");
        } catch (NumberFormatException e) {
            output.setText("Please enter a valid number.");
        }
    }


}