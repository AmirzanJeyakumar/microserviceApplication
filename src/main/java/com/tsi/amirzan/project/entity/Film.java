package com.tsi.amirzan.project.entity;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class Film {

    private int film_id;
    private String title;
    private String description;
    private int release_year;
    private int length;
    private String rating;

    public Film(String title, String description, int release_year, int length, String rating) {
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.length = length;
        this.rating = rating;
    }
}
