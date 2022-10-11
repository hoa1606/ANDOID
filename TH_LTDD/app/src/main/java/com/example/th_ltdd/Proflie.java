package com.example.th_ltdd;

import android.content.Intent;
import android.os.Bundle;
//import android.support.v4.app
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Proflie extends AppCompatActivity {

    Button dangxuat,bt_back_prf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proflie);

        dangxuat = findViewById(R.id.bt_dangXuat_prf);
        bt_back_prf = findViewById(R.id.button_back_prf);

        dangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Proflie.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bt_back_prf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Proflie.this, Home.class);
                startActivity(intent);
            }
        });
    }
}