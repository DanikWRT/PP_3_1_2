package ru.pogodindv.PP_3_1_2.dao;

import ru.pogodindv.PP_3_1_2.model.Film;

import java.util.List;

public interface FilmDao {
    List<Film> allFilms();
    void add(Film film);
    void delete(Film film);
    void edit(Film film);
    Film getById(int id);
}
