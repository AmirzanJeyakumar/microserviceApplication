Feature: Add actor into database using front end interface
  As a User, I want to add an actor into the database through the website

  Scenario: I successfully create a new actor
    Given The user is on the add actor webpage
    When The actor details are filled in
    And The submit button is pressed
    Then A message is shown that confirms the submission was successful