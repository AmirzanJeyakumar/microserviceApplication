package com.tsi.amirzan.project;

import com.tsi.amirzan.project.entity.FilmCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmCategoryTest {

    @Test
    public void testGetFilmId() {
        FilmCategory testFilmCategory = new FilmCategory(1,2);
        Assertions.assertEquals(1,testFilmCategory.getFilm_id(),"ID not found");
    }

    @Test
    public void testSetFilmId() {
        FilmCategory testFilmCategory = new FilmCategory(1,2);
        testFilmCategory.setFilm_id(3);
        Assertions.assertEquals(3,testFilmCategory.getFilm_id(),"ID not changed");
    }

    @Test
    public void testGetCategoryId() {
        FilmCategory testFilmCategory = new FilmCategory(1,2);
        Assertions.assertEquals(2,testFilmCategory.getCategory_id(),"ID not found");
    }

    @Test
    public void testSetCategoryId() {
        FilmCategory testFilmCategory = new FilmCategory(1,2);
        testFilmCategory.setCategory_id(3);
        Assertions.assertEquals(3,testFilmCategory.getCategory_id(),"ID not changed");
    }

}
