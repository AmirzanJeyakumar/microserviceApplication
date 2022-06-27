package com.tsi.amirzan.project.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FilmActor {

    private int actor_id;
    private int film_id;

    public FilmActor(int film_id){

        this.film_id = film_id;
    }
}
