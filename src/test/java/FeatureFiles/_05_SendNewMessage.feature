Feature: Send to message functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Send to Message

      When Click on the Hamburger Menu
      And Hover Over in the Messages
      Then Click on the Send Message
      And Enter form information
      Then Click on the Outbox and you should be see sent messages
