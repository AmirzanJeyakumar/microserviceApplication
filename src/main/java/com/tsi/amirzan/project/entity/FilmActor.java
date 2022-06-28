package com.tsi.amirzan.project.entity;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FilmActor {

    private int actor_id;
    private int film_id;

    public FilmActor(int film_id){

        this.film_id = film_id;
    }
}
