package com.example.listview_nc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TacPhamAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<tac_pham> tacphamList;

    public TacPhamAdapter(Context context, int layout, List<tac_pham> TacphamList) {
        this.context = context;
        this.layout = layout;
        tacphamList = TacphamList;
    }

    @Override
    public int getCount() {
        return tacphamList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        TextView txtTen;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TacPhamAdapter.ViewHolder holder;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null);
            holder = new TacPhamAdapter.ViewHolder();

            holder.txtTen = view.findViewById(R.id.textView_ten);

            view.setTag(holder);
        } else {
            holder = (TacPhamAdapter.ViewHolder) view.getTag();
        }

        tac_pham tacpham = tacphamList.get(i);

        holder.txtTen.setText(tacpham.getTen());
        return view;
    }
}

