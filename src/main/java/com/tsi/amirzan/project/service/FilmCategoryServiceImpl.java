package com.tsi.amirzan.project.service;


import com.tsi.amirzan.project.entity.FilmCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class FilmCategoryServiceImpl implements FilmCategoryService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<FilmCategory> findAll() {
        return jdbcTemplate.query("SELECT * FROM film_category", new BeanPropertyRowMapper<FilmCategory>(FilmCategory.class));
    }
}
