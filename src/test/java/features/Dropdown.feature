#@SmokeTest
Feature: Verify Dropdown box
  As a user of the application
  I want Dropdown feature
  So that I can select my options

  Background: Navigate
    Given the user navigate to home page
    And the user navigate to "Dropdown" page


  Scenario: 1. Verify the number of options available in dropdown box
    Then the user should see 3 options in the dropdown box


    Scenario Outline: 2. Verify that the user can select an option from the dropdown
    When the user select "<option>" option from the dropdown
    Then the user should see "<option>" option is selected in the dropdown

    Examples:
      | option   |
      | Option 1 |
      | Option 2 |



