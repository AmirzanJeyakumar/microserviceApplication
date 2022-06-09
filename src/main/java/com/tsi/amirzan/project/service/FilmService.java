package com.tsi.amirzan.project.service;

import com.tsi.amirzan.project.entity.Film;

import java.util.List;

public interface FilmService {

    public List<Film> findAll();

    public Film findById(int film_id);

    public int deleteById(int film_id);

    public int save(Film film);

    public int update(Film film, int film_id);

}
