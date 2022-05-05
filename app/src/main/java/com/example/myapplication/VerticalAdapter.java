package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.MyViewHolder> {
    Context context;
    ArrayList<VerticalModel> verticalModels;

    public VerticalAdapter(Context context, ArrayList<VerticalModel> verticalModels){

        this.context = context;
        this.verticalModels = verticalModels;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.verticalrecycler, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.VerticalName.setText(verticalModels.get(position).getVerticalname());
        holder.VerticalDescription.setText(verticalModels.get(position).getVerticaldescription());
        holder.imageView.setImageResource(verticalModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return verticalModels.size();
    }

   public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView VerticalName, VerticalDescription;
       public MyViewHolder(@NonNull View itemView) {
           super(itemView);

           imageView = itemView.findViewById(R.id.Verticalimage);
           VerticalDescription = itemView.findViewById(R.id.VerticalDescription);
           VerticalName = itemView.findViewById(R.id.Verticalname);

       }
   }
}
