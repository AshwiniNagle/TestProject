Feature: To Automate Amazon site

  Background: 
    Given Open "https://www.amazon.in/"

  Scenario: To test Amazon Home page title
    When Read home page title
    Then Display the title

  Scenario: To test search functionality
    When Enter text in searchbox
    And Click on search button
    Then user should get the result

  Scenario: To test add to cart functionality
    When Enter the text in  the searchbox
    And Click on search btn
    Then Item should get Added

  Scenario: To test Sell link Title
    When I Click on "Sell" link
    Then Read and display the title

  Scenario: To test Best Sellers link Title
    When I Click "Best" link
    Then Read and display title

  Scenario: To test Todays deal link Title
    When User Click on "Today" link
    Then Read and display the title of Todays deal

  Scenario: To test Mobiles link Title
    When Click on "Mobile" link
    Then Read and display the title of mobile page
