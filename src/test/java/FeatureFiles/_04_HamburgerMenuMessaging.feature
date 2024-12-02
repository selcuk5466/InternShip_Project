Feature: HamburgerMenu Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Click on the Hamburger Menu

      When Click on the Hamburger Menu
      And Click on the Messages
      And Hover Over in the Messages
      And Click on the Send Message
      And Click on the Inbox
      And Click on the Outbox
      And Click on the Trash
      Then User should be succesfully

