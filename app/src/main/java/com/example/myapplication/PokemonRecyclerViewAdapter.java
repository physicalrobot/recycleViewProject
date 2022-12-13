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

public class PokemonRecyclerViewAdapter extends RecyclerView.Adapter<PokemonRecyclerViewAdapter.MyViewHolder> {
    Context context;
    ArrayList<PokemonModel> pokemonModels;

    public PokemonRecyclerViewAdapter(Context context, ArrayList<PokemonModel> pokemonModels){
        this.context = context;
        this.pokemonModels = pokemonModels;

    }
    @NonNull
    @Override
    public PokemonRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //This is where you inflate the layout (Giving a look to our rows)
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row,parent,false);
        return new PokemonRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonRecyclerViewAdapter.MyViewHolder holder, int position) {
        //assigning values to the views we created
        holder.tvName.setText(pokemonModels.get(position).getPokemonName());
        holder.tv3Letter.setText(pokemonModels.get(position).getPokemonAbbreviation());
        holder.tv1Letter.setText(pokemonModels.get(position).getPokemonAbbreviationSmall());
        holder.imageView.setImageResource(pokemonModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        //
        return pokemonModels.size() ;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvName, tv3Letter, tv1Letter;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.tvfullnametxt);
            tv3Letter = itemView.findViewById(R.id.tvthreelet);
            tv1Letter = itemView.findViewById(R.id.tvonelet);

        }

    }
}
