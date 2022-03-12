package com.example.Lab08_recycler_view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Lab08_recycler_view.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView groupView,first_nameView,last_nameView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imageview);
        groupView = itemView.findViewById(R.id.group);
        first_nameView = itemView.findViewById(R.id.first_name);
        last_nameView = itemView.findViewById(R.id.last_name);
    }
}
