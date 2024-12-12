Feature: Home2 Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: View the message box
      When click three line on the top and see the messaging
      Then hover over messaging and click outbox
      And Verify that you can access the outbox list of outbox messages
