package com.example.Lab08_recycler_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Lab08_recycler_view.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<com.example.Lab08_recycler_view.MyViewHolder> {

    Context context;
    List<com.example.Lab08_recycler_view.Item> items;

    public MyAdapter(Context context, List<com.example.Lab08_recycler_view.Item> items) {
        this.context = context;
        this.items = items;
    }





    @NonNull
    @Override
    public com.example.Lab08_recycler_view.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new com.example.Lab08_recycler_view.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.Lab08_recycler_view.MyViewHolder holder, int position) {
        holder.groupView.setText(items.get(position).getGroup());
        holder.first_nameView.setText(items.get(position).getFirst_name());
        holder.last_nameView.setText(items.get(position).getLast_name());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
