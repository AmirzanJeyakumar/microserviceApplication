package com.tsi.amirzan.project.service;

import java.util.List;
import com.tsi.amirzan.project.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin
public class ActorServiceImpl implements ActorService {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Actor> findAll() {
        return jdbcTemplate.query("SELECT * FROM actor", new BeanPropertyRowMapper<>(Actor.class));
    }


    @Override
    public Actor findById(int actor_id) {
        return jdbcTemplate.queryForObject("SELECT * FROM actor WHERE actor_id=?", new BeanPropertyRowMapper<>(Actor.class), actor_id);
    }

    @Override
    public int deleteById(int actor_id) {
        return jdbcTemplate.update("DELETE FROM actor WHERE actor_id=?", actor_id);
    }

    @Override
    public int save(Actor actor) {
        return jdbcTemplate.update("INSERT INTO actor (first_name, last_name) VALUES (?, ?)", new Object[] {actor.getFirst_name(),actor.getLast_name()});
    }

    @Override
    public int update(Actor actor, int actor_id) {
        return jdbcTemplate.update("UPDATE actor SET first_name = ?, last_name = ? WHERE actor_id = ?", new Object[] {actor.getFirst_name(), actor.getLast_name(), actor_id});
    }
}
