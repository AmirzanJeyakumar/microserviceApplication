package com.tsi.amirzan.project;
import com.tsi.amirzan.project.entity.Actor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ActorTest {

    @Test
    public void testGetActor_id(){

        Actor testActor = new Actor("TestFName","TestLName");
        testActor.setActor_id(1);
        Assertions.assertEquals(1, testActor.getActor_id(),"ID not found");
    }

}
