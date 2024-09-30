package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.net.URL;

public class bookMarkList extends AppCompatActivity {

    EditText input;
    Button submit;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_book_mark_list);

        input = findViewById(R.id.et_bookMarkListInput);
        output = findViewById(R.id.tv_bookMarkListOutput);
        submit = findViewById(R.id.btn_bookMarkListSubmit);

        submit.setOnClickListener(v->{
            try{
                String urlString = input.getText().toString();

                URL url = new URL(urlString);

                output.setText("Url" + url);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}