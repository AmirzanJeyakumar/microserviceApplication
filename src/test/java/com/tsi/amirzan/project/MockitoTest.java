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

    @Test
    public void getActorById(){
        Actor testActor = new Actor("First","Last");
        testActor.setActor_id(5);

        when(actorService.findById(5)).thenReturn(testActor);
        Actor expected = testActor;
        Actor actual = actorController.findById(5);
        Assertions.assertEquals(expected,actual,"actor not found");

    }

    @Test
    public void saveActor(){
        Actor testActor = new Actor("First","Last");
        testActor.setActor_id(1);

        when(actorService.save(testActor)).thenReturn(1);
        String expected = "1 Actor saved successfully";
        String actual = actorController.save(testActor);
        Assertions.assertEquals(expected,actual,"actor not saved");

    }


    @Test
    public void deleteActor(){
        Actor testActor = new Actor("First","Last");
        testActor.setActor_id(1);

        when(actorService.deleteById(1)).thenReturn(1);
        String expected = "1 Actor deleted from the database";
        String actual = actorController.deleteById(1);
        Assertions.assertEquals(expected,actual,"actor not deleted");
    }

    @Test
    public void updateActor(){
        Actor testActor = new Actor("First","Last");
        testActor.setActor_id(1);
        Actor newActor = new Actor("a","b");

        when(actorService.update(newActor,1)).thenReturn(1);
        String expected = "1 Actor updated successfully";
        String actual = actorController.update(newActor,1);
        Assertions.assertEquals(expected,actual,"actor not updated");
    }
}
