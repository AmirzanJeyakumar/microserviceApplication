package com.tsi.amirzan.project.mockito;

import com.tsi.amirzan.project.controller.FilmController;
import com.tsi.amirzan.project.entity.Actor;
import com.tsi.amirzan.project.entity.Film;
import com.tsi.amirzan.project.service.FilmService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class FilmMockitoTest {


    @Mock
    private FilmController filmController;

    @Mock
    private FilmService filmService;
    @BeforeEach
    void setup(){
        filmService = mock(FilmService.class);

        filmController = new FilmController(filmService);
    }

    @Test
    public void findAllFilms(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        List<Film> filmList = new ArrayList<Film>();
        filmList.add(testFilm);

        when(filmService.findAll()).thenReturn(filmList);
        List<Film> expected = filmList;
        List<Film> actual = filmController.findAll();
        Assertions.assertEquals(expected,actual,"The list is incorrect");
    }


    @Test
    public void findFilmById(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        testFilm.setFilm_id(5);
        when(filmService.findById(5)).thenReturn(testFilm);
        Film expected = testFilm;
        Film actual = filmController.findById(5);
        Assertions.assertEquals(expected,actual,"actor not found");
    }

    @Test
    public void deleteFilmById(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        testFilm.setFilm_id(1);
        when(filmService.deleteById(1)).thenReturn(1);
        String expected = "1 Film deleted from the database";
        String actual = filmController.deleteById(1);
        Assertions.assertEquals(expected,actual,"film not deleted");
    }

    @Test
    public void saveFilm(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        testFilm.setFilm_id(1);
        when(filmService.save(testFilm)).thenReturn(1);
        String expected = "1 Film saved successfully";
        String actual = filmController.save(testFilm);
        Assertions.assertEquals(expected,actual,"film not saved");
    }

    @Test
    public void updateFilm(){
        Film testFilm = new Film("qwerty","asdf",2010,3,"PG");
        testFilm.setFilm_id(1);
        Film newFilm = new Film("ytrewq","fdsa",2020,4,"R");
        when(filmService.update(newFilm,1)).thenReturn(1);
        String expected = "1 Film updated successfully";
        String actual = filmController.update(newFilm,1);
        Assertions.assertEquals(expected,actual,"film not updated");
    }
}
