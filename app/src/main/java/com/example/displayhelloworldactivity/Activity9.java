package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import androidx.activity.EdgeToEdge;

public class Activity9 extends AppCompatActivity {

    private TextView output;
    private Button chkDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_9);

        output = findViewById(R.id.tv_9output);
        chkDate = findViewById(R.id.btn_9chkDate);

        chkDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get curent date
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String currentDate = dateFormat.format(new Date());

                output.setText("Current date: " + currentDate);
            }
        });
    }
}
