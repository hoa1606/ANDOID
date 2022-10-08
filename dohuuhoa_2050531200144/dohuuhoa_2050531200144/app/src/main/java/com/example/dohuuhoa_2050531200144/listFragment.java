package com.example.dohuuhoa_2050531200144;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class listFragment extends Fragment {

    ListView lvDienThoai;
    ArrayList<DienThoai> arrayDienThoai;
    DienThoaiAdapter adapter;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        lvDienThoai  = (ListView) v.findViewById(R.id.listView);

        arrayDienThoai =new ArrayList<>();

        arrayDienThoai.add(new DienThoai("Iphone 11", "10.000.000", R.drawable.iphone_11));
        arrayDienThoai.add(new DienThoai("Samsung galaxy S 22 Ultra", "27.000.000", R.drawable.galaxy_s22_ultra));
        arrayDienThoai.add(new DienThoai("Nokia g21", "5.000.000", R.drawable.nokia_g21));
        arrayDienThoai.add(new DienThoai("Oppo a55", "6.000.000", R.drawable.oppo_a55));
        arrayDienThoai.add(new DienThoai("redmi note 11 pro", "7.000.000", R.drawable.redmi_note_11));
        arrayDienThoai.add(new DienThoai("Samsung galaxy Z Flipp 4", "20.000.000", R.drawable.samsung_galaxy_z_flip4));
        arrayDienThoai.add(new DienThoai("Iphone 14 pro max", "40.000.000", R.drawable.iphone_14_pro_max));


        adapter = new DienThoaiAdapter(getActivity(),R.layout.dong_dien_thoai,arrayDienThoai);
        lvDienThoai.setAdapter(adapter);

        lvDienThoai.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0 ){
                    Intent intent = new Intent(getActivity(), TT_Iphone.class);
                    startActivity(intent);
                }else if( i == 1){
                    Intent intent = new Intent(getActivity(), TT_ss_s22.class);
                    startActivity(intent);
                }
            }
        });


        return v;
    }
}