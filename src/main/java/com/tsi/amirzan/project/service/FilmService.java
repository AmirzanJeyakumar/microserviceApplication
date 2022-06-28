package com.tsi.amirzan.project.service;

import com.tsi.amirzan.project.entity.Film;

import java.util.List;

public interface FilmService {

     List<Film> findAll();

     Film findById(int film_id);

     int deleteById(int film_id);

     int save(Film film);

     int update(Film film, int film_id);

}
