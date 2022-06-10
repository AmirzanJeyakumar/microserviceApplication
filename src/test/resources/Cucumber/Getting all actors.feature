Feature: Getting all actors
  As a user I want to view a list of all actors

  Scenario: I successfully see a list of all the actors
    Given that there is a list of actors
    When I request the list of actors
    Then I receive the list of actors