Feature: Google Search Functionality

  Scenario: To validate google search functionality
    Given Open google application
    When I enter Valid keyword in searchbox
    And Hit enter key
    Then Search result should display
