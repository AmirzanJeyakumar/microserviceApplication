package com.tsi.amirzan.project;
import com.tsi.amirzan.project.controller.ActorController;
import com.tsi.amirzan.project.entity.Actor;
import com.tsi.amirzan.project.service.ActorService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;






public class actorsStepsDef {


    @Mock
    private ActorController actorController;
    @Mock
    private ActorService actorService;
    @BeforeEach
    void setup(){
        actorService = mock(ActorService.class);

        actorController = new ActorController(actorService);

    }

    Actor testActor = new Actor("First","Last");

    List<Actor> actorList = new ArrayList<Actor>();


    // Getting all actors //

    @Given("that there is a list of actors")
    public void that_there_is_a_list_of_actors() {

        actorList.add(testActor);
    }
    @When("I request the list of actors")
    public void i_request_the_list_of_actors() {
        setup();
        when(actorService.findAll()).thenReturn(actorList);

    }
    @Then("I receive the list of actors")
    public void i_receive_the_list_of_actors() {
        List<Actor> expected = actorList;
        List<Actor> actual = actorController.findAll();
        Assertions.assertEquals(expected,actual,"The list is incorrect");

    }


    // Adding a new actor //


    @Given("that I have the actor details")
    public void that_i_have_the_actor_details() {
        testActor.setActor_id(5);
    }
    @When("I request to save the new actor")
    public void i_request_to_save_the_new_actor() {
        setup();
        when(actorService.save(testActor)).thenReturn(1);
    }
    @Then("the new actor is saved to the database")
    public void the_new_actor_is_saved_to_the_database() {
        String expected = "1 Actor saved successfully";
        String actual = actorController.save(testActor);
        Assertions.assertEquals(expected,actual,"actor not saved");
    }

}