Feature: Home Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Access to finance menu
      When clik three line on the top and see the finance
      Then Must be able to click on the finance link
      And Must have access to finance page and related information