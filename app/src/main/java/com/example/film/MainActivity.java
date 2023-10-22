package com.example.film;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Film> filmNameList = new ArrayList<>();
    private RecyclerView rvMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        filmNameList.add(new Film(" Аквамен и потерянное царство", 9.1));
        filmNameList.add(new Film(" Зеленая миля ", 9.1));
        filmNameList.add(new Film(" Побег из Шоушенка", 9.0));
        filmNameList.add(new Film(" Форрест Гамп", 9.0));
        filmNameList.add(new Film(" 1+1", 9.0));
        filmNameList.add(new Film(" Список Шиндлера", 8.9));
        filmNameList.add(new Film(" Интерстеллар", 8.9));
        filmNameList.add(new Film(" Властелин колец:\n Возвращение короля", 8.9));
        filmNameList.add(new Film(" Бойцовский клуб", 8.8));
        filmNameList.add(new Film(" Унесённые призраками ", 8.8));
        filmNameList.add(new Film(" Криминальное чтиво", 8.8));
        filmNameList.add(new Film(" Иван Васильевич меняет профессию", 8.8));
        filmNameList.add(new Film(" Властелин колец:\n Две крепости", 8.8));
        filmNameList.add(new Film(" Шрэк ", 8.8));
        filmNameList.add(new Film(" Король Лев ", 8.8));
        filmNameList.add(new Film(" Властелин колец:\n Братство Кольца ", 8.7));
        filmNameList.add(new Film(" Терминатор 2 :\n Судный день", 8.7));
        filmNameList.add(new Film(" Назад в будущие  ", 8.7));
        filmNameList.add(new Film(" Волк с Уолл-стрит ", 8.4));
        filmNameList.add(new Film(" Шерлок Холмс и доктор Вастон:\n Сокровищя Агры  ", 8.4));
        filmNameList.add(new Film(" Властелин колец:\n Братство Кольца ", 8.7));
        filmNameList.add(new Film(" Терминатор 2 :\n Судный день", 8.7));
        filmNameList.add(new Film(" Назад в будущие  ", 8.7));
        filmNameList.add(new Film(" Волк с Уолл-стрит ", 8.4));
        filmNameList.add(new Film(" Шерлок Холмс и доктор Вастон:\n Сокровищя Агры  ", 8.4));
        filmNameList.add(new Film(" Одержимость ", 8.4));
        filmNameList.add(new Film(" Матрица ", 8.4));
        filmNameList.add(new Film(" Балто", 8.2));
        filmNameList.add(new Film(" 12 лет рабства ", 8.2));
        filmNameList.add(new Film(" Дурак ", 8.2));
        filmNameList.add(new Film(" Гостиница Окко ", 8.2));
        filmNameList.add(new Film(" Лис и пёс ", 8.2));
        filmNameList.add(new Film(" В поисках Немо ", 8.2));
        filmNameList.add(new Film(" 101 далматинец ", 8.2));
        initAdapter();
    }

    private void initAdapter() {
        MoviesViewAdapter adapter = new MoviesViewAdapter(filmNameList);
        rvMovies.setAdapter(adapter);
    }

    private void initView() {
        rvMovies = findViewById(R.id.rv_movies);
    }



}