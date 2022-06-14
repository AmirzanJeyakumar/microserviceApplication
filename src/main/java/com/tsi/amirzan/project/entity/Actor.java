package com.tsi.amirzan.project.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter // annotation generates the setter methods //
@Getter // annotation generates the getter methods //
@NoArgsConstructor // generates parameterised constructor with all the fields //
@AllArgsConstructor // generates no-arg constructor //
public class Actor {

    private int actor_id;
    private String first_name;
    private String last_name;

    public Actor(String first_name,String last_name){

        this.first_name = first_name;
        this.last_name = last_name;
    }

}
