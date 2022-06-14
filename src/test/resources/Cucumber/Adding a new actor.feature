Feature: Adding a new actor
  As a user I want to add a new actor

  Scenario: I successfully add a new actor
    Given that I have the actor details
    When I request to save the new actor
    Then the new actor is saved to the database