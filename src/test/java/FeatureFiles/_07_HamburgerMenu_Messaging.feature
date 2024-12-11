Feature: Messaging Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:Send and Delete Message
      When Click trash and see and click delete ıtem and restore ıtem
      Then restore success and confirm  delete ıtem and successmessage