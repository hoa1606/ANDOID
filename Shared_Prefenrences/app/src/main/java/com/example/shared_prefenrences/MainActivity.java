package com.example.shared_prefenrences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt_UserName_SI, txt_Password_SI;
    Button bn_Signin_SI, bn_Signup_SI;
    CheckBox cb_luumk;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("dataLogin", MODE_PRIVATE);

        txt_UserName_SI = findViewById(R.id.editText_userName_SI);
        txt_Password_SI = findViewById(R.id.editText_userName_SI);
        bn_Signin_SI = findViewById(R.id.button_Signin_SI);
        bn_Signup_SI = findViewById(R.id.button_Signup_SI);
        cb_luumk = (CheckBox) findViewById(R.id.checkBox_luuMK);

        //lay ten va mk da luu
        txt_UserName_SI.setText(sharedPreferences.getString("taikhoan",""));
        txt_Password_SI.setText(sharedPreferences.getString("matkhau",""));
        cb_luumk.setChecked(sharedPreferences.getBoolean("chexked",false));


        //Button DANG KI


        //Button DANG NHAP
        bn_Signin_SI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = txt_UserName_SI.getText().toString().trim();
                String password = txt_Password_SI.getText().toString().trim();
                if (username.equals("a n") && password.equals("admin")) {
                    Toast.makeText(MainActivity.this, "Đăng nhập thành công!", Toast.LENGTH_LONG).show();
                    //nếu tick vào ChexBox
                    if(cb_luumk.isChecked()){
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("taikhoan", username);
                        editor.putString("matkhau", password);
                        editor.putBoolean("chexked", true);
                        editor.commit();
                    }else{
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.remove("taikhoan");
                        editor.remove("matkhau");
                        editor.remove("chexked");
                        editor.commit();
                    }
                } else Toast.makeText(MainActivity.this, "UserName và password sai!", Toast.LENGTH_LONG).show();

            }
        });
    }

}