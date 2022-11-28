package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.TextView;

import java.util.List;

public class PhepTinhAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<PhepTinh> phepTinhList;

    public PhepTinhAdapter(Context context, int layout, List<PhepTinh> phepTinhList) {
        this.context = context;
        this.layout = layout;
        this.phepTinhList = phepTinhList;
    }

    @Override
    public int getCount() {
        return phepTinhList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        //ánh xạ
        TextView txtTen = (TextView)  view.findViewById(R.id.textviewTen);
        TextView txtMoTa = (TextView)  view.findViewById(R.id.textviewMoTa);

        //gán giá trị
        PhepTinh phepTinh = phepTinhList.get(i);

        txtTen.setText(phepTinh.getTen());
        txtMoTa.setText(phepTinh.getMota());




        return view;
    }
}
