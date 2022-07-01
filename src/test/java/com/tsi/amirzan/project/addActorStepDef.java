package com.tsi.amirzan.project;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class addActorStepDef {

    private WebDriver driver;

    @Given("The user is on the add actor webpage")
    public void the_user_is_on_the_add_actor_webpage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/add");
    }
    @When("The actor details are filled in")
    public void the_actor_details_are_filled_in() {
        driver.findElement(By.id("first_name")).sendKeys("John");
        driver.findElement(By.id("last_name")).sendKeys("Doe");
    }
    @When("The submit button is pressed")
    public void the_submit_button_is_pressed() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
    }
    @Then("A message is shown that confirms the submission was successful")
    public void a_message_is_shown_that_confirms_the_submission_was_successful() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/h4")));


        boolean actual =  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/h4")).isEnabled();

        Assertions.assertEquals(true, actual, "Actor not successfully added to database");
    }

}
