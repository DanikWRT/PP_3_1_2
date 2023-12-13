package ru.pogodindv.PP_3_1_2.service;


import ru.pogodindv.PP_3_1_2.model.Film;

import java.util.List;

public interface FilmService {
    List<Film> allFilms();
    void add(Film film);
    void delete(Film film);
    void edit(Film film);
    Film getById(int id);
}
