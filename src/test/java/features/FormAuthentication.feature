
#@SmokeTest
Feature: Verify Form Authentication
  As a user of the application
  I should be able to login with valid credentials
  So that I can login into my account

  Background: Navigate
    Given the user navigate to home page
    And the user navigate to "Form Authentication" page


  Scenario: 1. Verify form authentication with valid credentials
    When the user login with "tomsmith" in username and "SuperSecretPassword!" in password
    Then the user click on logout button


    Scenario: 2. Verify form authentication with invalid credentials
    When the user login with "tomsmitn" in username and "SuperSecretPassword!" in password
    Then the user should "Your username is invalid!"


    Scenario: 3. Verify with invalid password
      When the user login with "tomsmith" in username and "SuperSecretPassword1" in password
      Then the user should "Your password is invalid!"

 # @SmokeTest
    Scenario Outline: 4. Verify Form authentication with invalid credentials using data driven
      When the user login with "<username>" in username and "<password>" in password
      Then the user should "<expectedText>"

      Examples:
        | username | password             | expectedText              |
        | tomsmitn | SuperSecretPassword! | Your username is invalid! |
        | tomsmith | SuperSecretPassword1 | Your password is invalid! |
        | tomsmitn | SuperSecretPassword1 | Your username is invalid! |


      # aligning the columns alt+command+l
      # scenario outline and scenario template are same
