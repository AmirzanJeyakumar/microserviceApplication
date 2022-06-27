package com.tsi.amirzan.project.service;

import com.tsi.amirzan.project.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Category> findAll() {
        return jdbcTemplate.query("SELECT * FROM category", new BeanPropertyRowMapper<Category>(Category.class));
    }

    @Override
    public Category findById(int film_id) {
        return jdbcTemplate.queryForObject("SELECT * FROM category WHERE category_id=?", new BeanPropertyRowMapper<Category>(Category.class), film_id);
    }
}
