package com.tsi.amirzan.project.service;

import com.tsi.amirzan.project.entity.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> findAll();

    List<Actor> findByNameContaining(String first_name);

    Actor findById(int actor_id);

     int deleteById(int actor_id);

     int save(Actor actor);

     int update(Actor actor, int actor_id);


}
