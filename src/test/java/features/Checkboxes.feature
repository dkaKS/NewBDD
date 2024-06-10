#@SmokeTest
Feature: Checkboxes
  As a user of the application
  I want Checkboxes feature
  So that I can select the checkboxes functionality


  Background: Navigate
    Given the user navigate to home page
    And the user navigate to "Checkboxes" page

  Scenario: 1. Verify that the user should able clear default and select the checkbox One
    When the user clears the default checkbox
    Then the user clicks checkbox one

    Scenario: 2. Verify that the user should able clear default and select the checkbox Two
      Then the user clicks checkbox Two



