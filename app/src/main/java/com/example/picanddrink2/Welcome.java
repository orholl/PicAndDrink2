package com.example.picanddrink2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends AppCompatActivity implements View.OnClickListener {
    TextView registerBtn;
    TextView signInBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_welcome);



        registerBtn = findViewById(R.id.register);
        registerBtn.setOnClickListener(this);
        signInBtn = findViewById(R.id.login);
        signInBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                startActivity(new Intent(Welcome.this, Login.class));
                break;
            case R.id.register:
                startActivity(new Intent(Welcome.this, Register.class));
                break;
        }
    }
}