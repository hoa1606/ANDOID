package com.example.listview_nc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Base64;
import java.util.List;

public class TraiCayAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<TraiCay> TraiCayList;

    public TraiCayAdapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        TraiCayList = traiCayList;
    }

    @Override
    public int getCount() {//độ dài của list
        return TraiCayList.size();
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
        TextView txtMoTa;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {//trả về mỗi dòng trên tem
        ViewHolder holder;

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null);
            holder = new ViewHolder();

            holder.txtTen = view.findViewById(R.id.Textview_Ten);
            holder.txtMoTa = view.findViewById(R.id.Textview_MoTa);
            holder.imHinh = view.findViewById(R.id.ImageView_Hinh);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        TraiCay traiCay = TraiCayList.get(i);

        holder.txtTen.setText(traiCay.getTen());
        holder.txtMoTa.setText(traiCay.getMoTa());
        holder.imHinh.setImageResource(traiCay.getHinh());

        return view;
    }
}
