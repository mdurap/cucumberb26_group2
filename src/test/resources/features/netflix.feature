Feature: Movie suggestion feature

  As a user I should be able to get movies according to my preference

  Scenario: Movie search
    Given I like "action"
    And I like "drama"
    And I like "cartoon"
    And I like "adventure"
    When I go to home page
    Then I should get right recommendation

  Scenario: Movie search datatable List
    Given I like
      | action    |
      | drama     |
      | cartoon   |
      | adventure |
    When I go to home page
    Then I should get right recommendation

  Scenario: Movie search datatable Map
    Given I like below favorite movie with certain type
      | action    | John Wick   |
      | drama     | Titanic     |
      | cartoon   | Tom & Jerry |
      | adventure | Tomb Rider  |
    When I go to home page
    Then I should get right recommendation

  Scenario: Movie search datatable List of List
    Given I like below favorite movie with ratings
      | action    | John Wick   | 9.3 |
      | drama     | Titanic     | 9.9 |
      | cartoon   | Tom & Jerry | 10  |
      | adventure | Tomb Rider  | 8.9 |
    When I go to home page
    Then I should get right recommendation

  Scenario: Movie search datatable List of Map
    Given I like below movie table with ratings
      | Genre     | Name        | Rating |
      | action    | John Wick   | 9.3    |
      | drama     | Titanic     | 9.9    |
      | cartoon   | Tom & Jerry | 10     |
      | adventure | Tomb Rider  | 8.9    |
    When I go to home page
    Then I should get right recommendation