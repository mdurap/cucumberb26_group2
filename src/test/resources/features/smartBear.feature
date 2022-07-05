Feature: Smartbear software link verification

  Scenario:
    Given User is on Smartbear home page
    When User enter username
    And User enter password
    And User click login button
    Then User count all the links on landing page
    Then User print out each link text on this page
