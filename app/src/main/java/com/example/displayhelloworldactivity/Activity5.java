package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity5 extends AppCompatActivity {

    TextView outputgen, outputname, outputage;
    EditText name, age;
    RadioButton rmale, rfemale;
    RadioGroup rbgroup;
    Button submit, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_5);

        outputgen = findViewById(R.id.tv_5gen);
        outputname = findViewById(R.id.tv_5name);
        outputage = findViewById(R.id.tv_5age);
        name = findViewById(R.id.et_5name);
        age = findViewById(R.id.et_5age);
        rmale = findViewById(R.id.rb_5male);
        rfemale = findViewById(R.id.rb_5female);
        rbgroup = findViewById(R.id.rdg_5rbgroup);

        submit = findViewById(R.id.btn_5submit);    //submit button
        submit.setOnClickListener(v ->{
            try {
                formOutput();
            }catch (Exception e){
                outputname.setText("You must input data first");
            }
        });

        clear = findViewById(R.id.btn_5clear);  //clear button
        clear.setOnClickListener(v ->{
            outputgen.setText("");
            outputname.setText("");
            outputage.setText("");
            name.setText("");
            age.setText("");
            rbgroup.setSelected(false);
        });

    }

    private void formOutput(){
        //set if male or female

        String gender;
        if(rfemale.isChecked()){
            gender = "Female";
        }else{
            gender = "Male";
        }

        //set generation by age
        int agerange = Integer.parseInt(age.getText().toString());
        String setgeneration;
        if(agerange < 12){
            setgeneration = "Young";
        }else if(agerange <= 18){
            setgeneration = "Teen";
        }else if(agerange <= 50){
            setgeneration = "Adult";
        }else{
            setgeneration = "Old";
        }
        String nameValue = name.getText().toString();

        outputgen.setText(setgeneration+ " " +gender);
        outputname.setText(nameValue);
        outputage.setText(age.getText().toString());

    }
}