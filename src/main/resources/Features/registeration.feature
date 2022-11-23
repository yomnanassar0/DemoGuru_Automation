@smoke
Feature: F01_Register | users could register with new accounts
  Background:
    Given user go to login page
    And user enters "mngr456973" and "dumYjYh"
    And click on login button
    And user login successfully


  Scenario: valid data
    Given user go to new customer page
    When user enter first name and last name
    And user select gender type
    And user enter address
    And user enter date of birth
    And user enter city
    And user enter state
    And user enters pin"1234567"
    And user enters phone"0111222333444"
    And user enters email"octo4@octo.com"
    And user enters password"dumYjYh"
    And click on submit button
    Then check success

  Scenario: already registered guest
    Given user go to new customer page
    When user enter first name and last name
    And user select gender type
    And user enter address
    And user enter date of birth
    And user enter city
    And user enter state
    And user enters pin"1234567"
    And user enters phone"0111222333444"
    And user enters email"octo@octo.com"
    And user enters password"dumYjYh"
    And click on submit button
    Then Already registered

  Scenario: entering empty data
    Given user go to new customer page
    When click on submit button
    Then Check empty data






