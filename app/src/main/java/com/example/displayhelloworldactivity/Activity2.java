package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView output;
        Button click;

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);

        output = findViewById(R.id.tv_outputhello);
        click = findViewById(R.id.btn_Click);
        click.setOnClickListener(v ->{
            output.setText("Hello World!");
        });

    }
}