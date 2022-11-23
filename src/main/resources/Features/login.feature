@smoke
Feature: login using username & password

  Background:
    Given user go to login page


  Scenario: valid data
    When user enters "mngr456757" and "sebUbUm"
    And click on login button
    Then user login successfully


  Scenario: invalid data
    When user enters "bla" and "password"
    And click on login button
    Then user cannot login


  Scenario: empty data
    When user enters "" and ""
    And display empty alert
    And click on login button
    Then user cannot login