package com.example.listview_nc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTraiCay;
    ArrayList<TraiCay> arrayTraiCay;
    TraiCayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTraiCay = findViewById(R.id.listviewTraiCay);
        arrayTraiCay = new ArrayList<>();

        arrayTraiCay.add(new TraiCay("Tác giả: Nguyễn Du", "Là một đại thi hào dân tộc", R.drawable.nguyendu));
        arrayTraiCay.add(new TraiCay("Tác giả: Huy Cận", "là một chính khách" , R.drawable.huycan));
        arrayTraiCay.add(new TraiCay("Tác giả: Mạc Ngôn", "là một nhà văn người Trung Quốc xuất thân từ nông dân", R.drawable.macngon));
        arrayTraiCay.add(new TraiCay("Tác giả: Shakespeare", "à một nhà viết kịch, nhà thơ và diễn viên người Anh", R.drawable.shakespjfif));
        arrayTraiCay.add(new TraiCay("Tác giả: Hemingway", "là một tiểu thuyết gia , nhà văn viết truyện ngắn và nhà báo người Mỹ ", R.drawable.hemingway));

        adapter = new TraiCayAdapter(this, R.layout.dong_trai_cay, arrayTraiCay);
        lvTraiCay.setAdapter(adapter);

        lvTraiCay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, TacPham.class);
                startActivity(intent);
            }
        });
    }
    }



