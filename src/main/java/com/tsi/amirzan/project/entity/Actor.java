package com.tsi.amirzan.project.entity;


import lombok.*;


@Setter // annotation generates the setter methods //
@Getter // annotation generates the getter methods //
@AllArgsConstructor // generates no-arg constructor //
@NoArgsConstructor
public class Actor {

    private int actor_id;
    private String first_name;
    private String last_name;

    public Actor(String first_name,String last_name){

        this.first_name = first_name;
        this.last_name = last_name;
    }

}
