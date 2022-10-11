package com.example.th_ltdd;

import android.content.Intent;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class List extends AppCompatActivity {

    ListView lvDienThoai;
    ArrayList<DienThoai> arrayDienThoai;
    DienThoaiAdapter adapter;
    Button bt_back_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        AnhXa();

        bt_back_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(List.this, Home.class);
                startActivity(intent);
            }
        });

       adapter = new DienThoaiAdapter(this,R.layout.dong_dien_thoai,arrayDienThoai);
        lvDienThoai.setAdapter(adapter);

        lvDienThoai.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0 ){
                    Intent intent = new Intent(List.this, TT_Iphone.class);
                    startActivity(intent);
                }else if( i == 1){
                    Intent intent = new Intent(List.this, TT_ss_s22.class);
                    startActivity(intent);
                }
            }
        });
    }
    public void AnhXa() {
        bt_back_list = findViewById(R.id.button_back_list);
        arrayDienThoai =new ArrayList<>();

        arrayDienThoai.add(new DienThoai("Iphone 11", "10.000.000", R.drawable.iphone_11));
        arrayDienThoai.add(new DienThoai("Samsung galaxy S 22 Ultra", "27.000.000", R.drawable.galaxy_s22_ultra));
        arrayDienThoai.add(new DienThoai("Nokia g21", "5.000.000", R.drawable.nokia_g21));
        arrayDienThoai.add(new DienThoai("Oppo a55", "6.000.000", R.drawable.oppo_a55));
        arrayDienThoai.add(new DienThoai("redmi note 11 pro", "7.000.000", R.drawable.redmi_note_11));
        arrayDienThoai.add(new DienThoai("Samsung galaxy Z Flipp 4", "20.000.000", R.drawable.samsung_galaxy_z_flip4));
        arrayDienThoai.add(new DienThoai("Iphone 14 pro max", "40.000.000", R.drawable.iphone_14_pro_max));
    }

}