package com.example.th_ltdd;

import android.content.Intent;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {

    Button bt_DN_SI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        bt_DN_SI = findViewById(R.id.button_dangNhap_SI);

        bt_DN_SI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    }
