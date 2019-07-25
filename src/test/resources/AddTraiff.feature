@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given User is in the homepage
    And User click on the Add tariff button
    When User is entering the detailss    
    |monRent|500|
    |flmin|50|
    |fim|20|
    |fsp|15|
    |lpmc|2|
    |ipmc|10|
    |spc|3|
    And User is clicking on submit
    Then User verify the tariff plan is added sucessfully
    


