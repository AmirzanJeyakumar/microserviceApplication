package com.tsi.amirzan.project.service;

import java.util.List;
import com.tsi.amirzan.project.entity.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FilmServiceImpl implements FilmService {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Film> findAll() {
        return jdbcTemplate.query("SELECT * FROM film", new BeanPropertyRowMapper<Film>(Film.class));
    }

    @Override
    public Film findById(int film_id) {
        return jdbcTemplate.queryForObject("SELECT * FROM film WHERE film_id=?", new BeanPropertyRowMapper<Film>(Film.class), film_id);
    }

    @Override
    public int deleteById(int film_id) {
        return jdbcTemplate.update("DELETE FROM film WHERE film_id=?", film_id);
    }

    @Override
    public int save(Film film) {
        return jdbcTemplate.update("INSERT INTO film (title, description, release_year, length, rating) VALUES (?,?,?,?,?)", new Object[] {film.getTitle(),film.getDescription(),film.getRelease_year(),film.getLength(),film.getRating()});
    }

    @Override
    public int update(Film film, int film_id) {
        return jdbcTemplate.update("UPDATE film SET title = ?, description = ?, release_year = ?, length = ?, rating = ? WHERE film_id = ?", new Object[] {film.getTitle(),film.getDescription(),film.getRelease_year(),film.getLength(),film.getRating(), film_id});
    }
}
