package com.example.listview_nc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class TacPham extends AppCompatActivity {

    Button btBack;

    ListView lvTacPham;
    ArrayList<tac_pham> arrayTacPham;
    TacPhamAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tac_pham);

        btBack = findViewById(R.id.button);


        lvTacPham = findViewById(R.id.lv_tacpham);
        arrayTacPham = new ArrayList<>();

        arrayTacPham.add(new tac_pham("Thanh Hiên tiền hậu tập"));
        arrayTacPham.add(new tac_pham("Nam trung tạp ngâm"));
        arrayTacPham.add(new tac_pham("Đoạn trường tân thanh "));
        arrayTacPham.add(new tac_pham("Bắc hành tạp lục "));
        arrayTacPham.add(new tac_pham("Thác lời trai phường nón"));

        adapter = new TacPhamAdapter(this, R.layout.dong_tacpham, arrayTacPham);
        lvTacPham.setAdapter(adapter);


        lvTacPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(TacPham.this, chitiet.class);
                startActivity(intent);
            }
        });





        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TacPham.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}