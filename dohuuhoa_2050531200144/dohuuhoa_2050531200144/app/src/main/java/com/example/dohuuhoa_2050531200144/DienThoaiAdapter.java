package com.example.dohuuhoa_2050531200144;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DienThoaiAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<DienThoai> DienThoaiList;

    public DienThoaiAdapter(Context context, int layout, List<DienThoai> dienThoaiList) {
        this.context = context;
        this.layout = layout;
        this.DienThoaiList = dienThoaiList;
    }

    @Override
    public int getCount() {//độ dài của list
        return DienThoaiList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    //khi load lại chỉ cấp giá trị chứ k ánh xạ lại(vs những view đã ánh xạ rồi)
    private class ViewHolder{
        ImageView imHinh;
        TextView txtTen;
        TextView txtGia;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {//trả về mỗi dòng trên tem
        ViewHolder holder;

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null);
            holder = new ViewHolder();

            holder.txtTen = view.findViewById(R.id.Textview_Ten);
            holder.txtGia = view.findViewById(R.id.Textview_Gia);
            holder.imHinh = view.findViewById(R.id.ImageView_Hinh);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        DienThoai dientThoai = DienThoaiList.get(i);

        holder.txtTen.setText(dientThoai.getTen());
        holder.txtGia.setText(dientThoai.getGia());
        holder.imHinh.setImageResource(dientThoai.getHinh());

        return view;
    }
}
