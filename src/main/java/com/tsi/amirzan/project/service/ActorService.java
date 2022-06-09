package com.tsi.amirzan.project.service;

import com.tsi.amirzan.project.entity.Actor;

import java.util.List;

public interface ActorService {
    public List<Actor> findAll();

    public Actor findById(int actor_id);

    public int deleteById(int actor_id);

    public int save(Actor actor);

    public int update(Actor actor, int actor_id);
}
