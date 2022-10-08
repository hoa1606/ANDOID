package com.example.dohuuhoa_2050531200144;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class DangKi extends AppCompatActivity {

    Button bt_DN_SI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki);

        bt_DN_SI = findViewById(R.id.button_dangNhap_SI);

        bt_DN_SI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangKi.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}