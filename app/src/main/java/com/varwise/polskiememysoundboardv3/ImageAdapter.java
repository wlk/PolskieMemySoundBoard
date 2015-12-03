package com.varwise.polskiememysoundboardv3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new SquareImageView(mContext);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(1, 1, 1, 1);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.acotutajsiewyprawia,
            R.drawable.aleurwal,
            R.drawable.cokurwa,
            R.drawable.dajkamienia,
            R.drawable.gimbynieznajo,
            R.drawable.jestemhardkorem,
            R.drawable.jesteszwyciezca,
            R.drawable.kopytko,
            R.drawable.krzycztrybson,
            R.drawable.lubiszto,
            R.drawable.matkawiezecpiesz,
            R.drawable.nakurwiamwegorza,
            R.drawable.niechginie,
            R.drawable.nieee,
            R.drawable.nonie,
            R.drawable.przypadekniesondze,
            R.drawable.siemaheniu,
            R.drawable.szczymryj,
            R.drawable.takasytuacja,
            R.drawable.tojeamelinium,
            R.drawable.wezsietato,
            R.drawable.miotanimjakszatan,
            R.drawable.lubieplacki,
    };
}