Feature: Searching terms on google

  As a person
  I want to search a term
  So that I can find information about it


  Scenario Outline: searching from google
    Given I go to "<website>" website
    When  I search for "<searchterm>"
    Then  I am taken to a page with relevant infomation about the searchterm
    Examples:
      |website  | searchterm|
      | https://www.Google.com | IBM |
      | https://www.Google.com | BAPE |
      | https://www.Google.com | batman |




