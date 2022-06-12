package com.tsi.amirzan.project;

import com.tsi.amirzan.project.entity.Actor;
import com.tsi.amirzan.project.entity.Film;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {


    @Test
    public void testGetFilm_id(){

        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        testFilm.setFilm_id(1);
        Assertions.assertEquals(1, testFilm.getFilm_id(),"ID not found");
    }

    @Test
    public void testSetFilm_id(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        testFilm.setFilm_id(1);
        Assertions.assertEquals(1,testFilm.getFilm_id(),"id not changed");
        testFilm.setFilm_id(2);
        Assertions.assertEquals(2,testFilm.getFilm_id(),"id not changed");
    }

    @Test
    public void testGetTitle(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        testFilm.setFilm_id(1);
        Assertions.assertEquals("qwerty",testFilm.getTitle(),"wrong title");
    }

    @Test
    public void testSetTitle(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        testFilm.setTitle("one");
        Assertions.assertEquals("one",testFilm.getTitle(),"title not changed");
    }

    @Test
    public void testGetDescription(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        Assertions.assertEquals("asdf",testFilm.getDescription(),"description not found");
    }

    @Test
    public void testSetDescription(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        testFilm.setDescription("fdsa");
        Assertions.assertEquals("fdsa",testFilm.getDescription(),"description not changed");
    }

    @Test
    public void testGetReleaseYear(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        Assertions.assertEquals(2010,testFilm.getRelease_year(),"release year not found");
    }

    @Test
    public void testSetReleaseYear(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        testFilm.setRelease_year(2020);
        Assertions.assertEquals(2020,testFilm.getRelease_year(),"release year not changed");
    }

    @Test
    public void testGetLength(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        Assertions.assertEquals(3,testFilm.getLength(),"length not found");
    }

    @Test
    public void testSetLength(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        testFilm.setLength(4);
        Assertions.assertEquals(4,testFilm.getLength(),"length not changed");
    }

    @Test
    public void testGetRating(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        Assertions.assertEquals("PG",testFilm.getRating(),"rating not found");
    }

    @Test
    public void testSetRating(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        testFilm.setRating("R");
        Assertions.assertEquals("R",testFilm.getRating(),"rating not changed");
    }

}
