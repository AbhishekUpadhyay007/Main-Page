package com.example.uidesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter {

    Context context;
    int[] image;
    String[] title;
    LayoutInflater inflater;

    public MainAdapter(Context context, int[] image, String[] title){

        this.context = context;
        this.image = image;
        this.title = title;

    }

    @Override
    public int getCount() {
        return title.length;
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

        if(inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        if(view == null){
            view = inflater.inflate(R.layout.row_item, null);
        }

        ImageView imageView = view.findViewById(R.id.rowImage);
        TextView textView = view.findViewById(R.id.rowText);

        imageView.setImageResource(image[i]);
        textView.setText(title[i]);

        return view;
    }
}
