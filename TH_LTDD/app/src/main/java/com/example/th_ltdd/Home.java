package com.example.th_ltdd;

import android.content.Intent;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    Button bt_profile,bt_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bt_list = findViewById(R.id.button_list);
        bt_profile = findViewById(R.id.button_profile);

        bt_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Proflie.class);
                startActivity(intent);
            }
        });

        bt_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, List.class);
                startActivity(intent);
            }
        });
    }
}