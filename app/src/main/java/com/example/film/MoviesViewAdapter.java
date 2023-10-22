package com.example.film;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.film.Film;
import com.example.film.MoviesViewHolder;

import java.util.ArrayList;

public class MoviesViewAdapter extends RecyclerView.Adapter<MoviesViewHolder> {
   private ArrayList<Film> filmList;

    public MoviesViewAdapter(ArrayList<Film> filmList) {
       this.filmList= filmList;
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MoviesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movies,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {
        holder.onBing(filmList.get(position));

    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }
}
