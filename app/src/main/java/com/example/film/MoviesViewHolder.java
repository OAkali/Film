package com.example.film;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MoviesViewHolder extends RecyclerView.ViewHolder {
    private TextView filmName;
    private TextView filmRatings;
    public MoviesViewHolder(@NonNull View itemView) {
        super(itemView);
        filmName=itemView.findViewById(R.id.tv_film);
        filmRatings=itemView.findViewById(R.id.rating_tv);

    }

    public void onBing(Film film) {
        filmName.setText(film.getName());
        filmRatings.setText(String.valueOf(film.getRatings()));
    }
}
