package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class quiz extends AppCompatActivity {

    TextView output;
    RadioGroup rbGroup;
    RadioButton zilong, miya, franco, layla, vale;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz);
        output = findViewById(R.id.tv_quizOutput);
        rbGroup = findViewById(R.id.rg_quizRadioGroup);
        zilong = findViewById(R.id.rb_quizZilong);
        miya = findViewById(R.id.rb_quizMiya);
        franco = findViewById(R.id.rb_quizFranco);
        layla = findViewById(R.id.rb_quizLayla);
        vale = findViewById(R.id.rb_quizVale);
        submit = findViewById(R.id.btn_quizSubmit);

        submit.setOnClickListener(v-> {
            if (franco.isChecked()) {
                output.setText("Congrats! isa ka ng ganap na tambay");
            } else {
                output.setText("Wronggg! Eme ka den eh XD");
            }
        });
    }
}