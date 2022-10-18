@wikipedia
Feature: Wikipedia Search Feature

  @smoke
  Scenario Outline: Verify on entering meaningful sentences, the user should see search results.
    Given visit homepage
    And click search button
    When search with "<text>" text
    Then verify "<text>" among search results
    Examples:
      | text             |
      | SOLID Principles |
      | Linus Torvalds   |
      | Apple            |
      | Apple Silicon    |


  @smoke
  Scenario Outline: Verify on entering meaningful sentences with filetype, the user should see search results.
    Given visit homepage
    And click search button
    And set filetype to "<fileType>"
    When search with "<text>" text
    And verify "<fileType>" file type among search results
    Examples:
      | text    | fileType |
      | Turkey  | svg      |
      | Germany | jpg      |
      | Dog     | png      |
      | Bird    | gif      |