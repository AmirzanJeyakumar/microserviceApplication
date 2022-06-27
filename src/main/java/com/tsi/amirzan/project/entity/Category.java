package com.tsi.amirzan.project.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    private int category_id;
    private String name;

    public Category(String name){
        this.name = name;
    }

}
