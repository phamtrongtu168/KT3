package com.trongtu.tacgia.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.trongtu.tacgia.model.TacGia;
import com.zantung.pheptinh.R;

import java.util.List;

public class TacGiaAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<TacGia> tacGiaList;

    public TacGiaAdapter(Context context, int layout, List<TacGia> tacGiaList) {
        this.context = context;
        this.layout = layout;
        this.tacGiaList = tacGiaList;
    }

    @Override
    public int getCount() {
        return tacGiaList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
                ImageView imgTacGia;
                TextView tv_tacgia;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();

            holder.tv_tacgia = view.findViewById(R.id.tvTenTacGia);
            holder.imgTacGia = view.findViewById(R.id.img_tacgia);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        //gán giá trị
        TacGia tacGia = tacGiaList.get(i);
        holder.tv_tacgia.setText(tacGia.getTen_tacgia());
        holder.imgTacGia.setImageResource(tacGia.getImgTacGia());
        return view;
    }
}
