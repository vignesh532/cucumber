@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Need to create a new customer
    Given User is in the homepage of site
    And User click on the add button
    When User will enter the details
   
    |fname|Vignesh|
    |lname|Babu|
    |mail|vignesh@gmail.com|
    |add|Salem|
    |mobile|9790230532|
        
    And User will click on the submit button
    Then User will validate whether customer id is generated
    