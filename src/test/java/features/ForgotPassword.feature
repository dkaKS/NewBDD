#@SmokeTest
Feature: Forgot Password
  As a user of the application
  I want Forgot Password feature
  So that I can reset my password when i forget it


  #@SmokeTest
  Scenario: 1. Re-set password for "test1@example.com" user
    Given the user navigate to home page
    And the user navigate to "Forgot Password" page
    When the user enters "test1@example.com" in email field
    And the user clicks on Retrieve Password button
    Then the user sees "Internal Server Error"
#

      Scenario: 2 Verify Reset password Invalid email
        Given the user navigate to home page
        And the user navigate to "Forgot Password" page
        When the user enters "example" in email field
        And the user clicks on Retrieve Password button
        Then the user sees "Internal Server Error"