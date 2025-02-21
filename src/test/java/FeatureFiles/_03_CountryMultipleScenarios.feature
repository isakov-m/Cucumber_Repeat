Feature: Country Multi Scenario

  Background: # before senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country

  Scenario: Create country
    When Create country
    Then Success message should be displayed

    Scenario: Create country 2
      When Create a country name as "ismU255" code as "U255"
      Then Success message should be displayed