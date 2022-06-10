package com.tsi.amirzan.project;


import com.tsi.amirzan.project.controller.ActorController;
import com.tsi.amirzan.project.entity.Actor;
import com.tsi.amirzan.project.service.ActorService;
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
public class MockitoTest {

    @Mock
    private ActorController actorController;

    @Mock
    private ActorService actorService;
    @BeforeEach
    void setup(){
        actorService = mock(ActorService.class);

        actorController = new ActorController(actorService);

    }

    @Test
    public void getAllActors(){

        Actor testActor = new Actor("First","Last");
        List<Actor> actorList = new ArrayList<Actor>();
        actorList.add(testActor);

        when(actorService.findAll()).thenReturn(actorList);
        List<Actor> expected = actorList;
        List<Actor> actual = actorController.findAll();
        Assertions.assertEquals(expected,actual,"The list is incorrect");

    }
}
