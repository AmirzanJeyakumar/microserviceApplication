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

    @Test
    public void testSetActor_id(){
        Actor testActor = new Actor("First","Last");
        testActor.setActor_id(1);
        Assertions.assertEquals(1,testActor.getActor_id(),"id not changed");
        testActor.setActor_id(2);
        Assertions.assertEquals(2,testActor.getActor_id(),"id not changed");
    }

    @Test
    public void testGetFirstName(){
        Actor testActor = new Actor("First","Last");
        Assertions.assertEquals("First",testActor.getFirst_name(),"first name not found");
    }

    @Test
    public void testSetFirstName(){
        Actor testActor = new Actor("First","Last");
        testActor.setFirst_name("Second");
        Assertions.assertEquals("Second",testActor.getFirst_name(),"first name not changed");
    }

    @Test
    public void testGetLastName(){
        Actor testActor = new Actor("First","Last");
        Assertions.assertEquals("Last",testActor.getLast_name(),"last name not found");
    }

    @Test
    public void testSetLastName(){
        Actor testActor = new Actor("First","Last");
        testActor.setLast_name("NotLast");
        Assertions.assertEquals("NotLast",testActor.getLast_name(),"last name not changed");
    }

}
