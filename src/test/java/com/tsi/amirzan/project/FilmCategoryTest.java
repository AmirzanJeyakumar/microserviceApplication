package com.tsi.amirzan.project;

import com.tsi.amirzan.project.entity.FilmCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmCategoryTest {

    @Test
    public void testGetFilmId() {
        FilmCategory testFilmCategory = new FilmCategory(1000,20);
        Assertions.assertEquals(1000,testFilmCategory.getFilm_id(),"ID not found");
    }

    @Test
    public void testSetFilmId() {
        FilmCategory testFilmCategory = new FilmCategory(1000,20);
        testFilmCategory.setFilm_id(2000);
        Assertions.assertEquals(2000,testFilmCategory.getFilm_id(),"ID not changed");
    }

    @Test
    public void testGetCategoryId() {
        FilmCategory testFilmCategory = new FilmCategory(1000,20);
        Assertions.assertEquals(20,testFilmCategory.getCategory_id(),"ID not found");
    }

    @Test
    public void testSetCategoryId() {
        FilmCategory testFilmCategory = new FilmCategory(20);
        testFilmCategory.setCategory_id(30);
        Assertions.assertEquals(30,testFilmCategory.getCategory_id(),"ID not changed");
    }

}
