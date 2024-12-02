Feature: Home2 Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Click on menu items

    When click on the menu items
    Then must verify that the menu page opens