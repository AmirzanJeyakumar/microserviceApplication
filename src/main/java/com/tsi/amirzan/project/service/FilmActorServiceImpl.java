package com.tsi.amirzan.project.service;


import com.tsi.amirzan.project.entity.FilmActor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmActorServiceImpl implements FilmActorService {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<FilmActor> findAll() {
        return jdbcTemplate.query("SELECT * FROM film_actor", new BeanPropertyRowMapper<FilmActor>(FilmActor.class));
    }

}