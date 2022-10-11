package com.example.th_ltdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText tenDN,MK;
    Button DN_SU,DX_SU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();

        DN_SU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }

        });
        DX_SU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this, Signup.class);
                startActivity(intent);
            }
        });



    }
    public void AnhXa() {
        tenDN = (EditText) findViewById(R.id.textVie_tenDN);
        MK = (EditText) findViewById(R.id.editText_MK);
        DN_SU = (Button) findViewById(R.id.button_dangNhap);
        DX_SU = (Button) findViewById(R.id.button_dangKi);
    }
}