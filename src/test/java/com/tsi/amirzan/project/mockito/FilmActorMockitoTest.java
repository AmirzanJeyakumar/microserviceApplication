package com.tsi.amirzan.project.mockito;


import com.tsi.amirzan.project.controller.FilmActorController;
import com.tsi.amirzan.project.entity.FilmActor;
import com.tsi.amirzan.project.service.FilmActorService;
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
public class FilmActorMockitoTest {

    @Mock
    private FilmActorController filmActorController;
    @Mock
    private FilmActorService filmActorService;

    @BeforeEach
    void setup(){
        filmActorService = mock(FilmActorService.class);

        filmActorController = new FilmActorController(filmActorService);

    }

    @Test
    public void getAllFilmActor(){

        FilmActor testFilmActor = new FilmActor(1,1);
        List<FilmActor> filmActorList = new ArrayList<FilmActor>();
        filmActorList.add(testFilmActor);

        when(filmActorService.findAll()).thenReturn(filmActorList);
        List<FilmActor> expected = filmActorList;
        List<FilmActor> actual = filmActorController.findAll();
        Assertions.assertEquals(expected,actual,"The list is incorrect");

    }
}
