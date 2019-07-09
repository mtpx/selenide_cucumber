Feature: User should be able to secure his account

  Background:
    Given user is on login page programs

  Scenario: Login to programs with invalid credentials
    When he enters invalid credentials to programs
    Then he isn't logged in programs

  Scenario: Login to programs with valid credentials
    When he enters valid credentials to programs
    Then he is logged in programs



