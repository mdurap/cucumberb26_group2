
Feature:Users should be able to login
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: driver, sales manager, store manager

  Scenario Outline: Login as driver
    Given user is on the login page
    When user enters the "<Credential>" information
    Then user should be able to login
    Examples:
      | Credential    |
      | driver        |
      | sales manager |
      | store manager |
