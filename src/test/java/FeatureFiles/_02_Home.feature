Feature: Home Functionality

Background:
  Given Navigate to Campus
  When Enter username and password and click login button
  Then User should login successfully

  Scenario: Click the company logo and redirect to TechnoStudy Home Page

  When click the logo
  Then must verify that the home page opens

