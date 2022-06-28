package com.tsi.amirzan.project.entity;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class FilmCategory {

    private int film_id;
    private int category_id;

    public FilmCategory(int category_id){

        this.category_id = category_id;
    }
}
