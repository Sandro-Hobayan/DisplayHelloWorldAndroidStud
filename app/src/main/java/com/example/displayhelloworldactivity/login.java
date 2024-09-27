package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    TextView output;
    EditText email, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        output = findViewById(R.id.tv_loginOutput);
        email = findViewById(R.id.et_loginEmail);
        password = findViewById(R.id.et_loginPass);
        login = findViewById(R.id.btn_loginLogin);

        login.setOnClickListener(v ->{
                login();
        });
    }

    public void login(){
        String emailValue = email.getText().toString();
        String passValue = password.getText().toString();
        if(emailValue.isEmpty() && passValue.isEmpty()){
            output.setText("Please enter your creadentials first");
        }else{
            if(emailValue.equals("sandro@gmail.com") && passValue.equals("sandro")){
                output.setText("Login Successfully!");
            }else{
                output.setText("Invalid credentials");
            }
        }
    }
}