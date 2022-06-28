package com.tsi.amirzan.project;

import com.tsi.amirzan.project.entity.FilmActor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmActorTest {

    @Test
    public void testGetActorId() {
        FilmActor testFilmActor = new FilmActor(300,2000);
        Assertions.assertEquals(300,testFilmActor.getActor_id(),"ID not found");
    }

    @Test
    public void testSetActorId() {
        FilmActor testFilmActor = new FilmActor(300,2000);
        testFilmActor.setActor_id(400);
        Assertions.assertEquals(400,testFilmActor.getActor_id(),"ID not changed");
    }

    @Test
    public void testGetFilmId(){
        FilmActor testFilmActor = new FilmActor(300,2000);
        Assertions.assertEquals(2000,testFilmActor.getFilm_id(),"ID not found");
    }

    @Test
    public void testSetFilmId() {
        FilmActor testFilmActor = new FilmActor(2000);
        testFilmActor.setFilm_id(3000);
        Assertions.assertEquals(3000,testFilmActor.getFilm_id(),"ID not changed");
    }
}
