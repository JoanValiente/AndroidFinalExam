package com.example.joanvil.joanvaliente;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    ListActivity listActivity;
    List<Model> modelList;
    Context context;

    public Adapter(ListActivity listActivity, List<Model> modelList) {
        this.listActivity = listActivity;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_layout, parent, false);

       ViewHolder viewHolder = new ViewHolder(itemView);

       viewHolder.setOnClickListener(new ViewHolder.ClickListener() {
           @Override
           public void onItemClick(View view, int position) {
               String id = modelList.get(position).getId();
               String descr = modelList.get(position).getDescription();
               Toast.makeText(listActivity, id+"\n"+descr, Toast.LENGTH_SHORT).show();
           }

           @Override
           public void onItemLongClick(View view, int position) {

           }
       });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mTitle.setText(modelList.get(position).getId());
        holder.mDescription.setText(modelList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}
