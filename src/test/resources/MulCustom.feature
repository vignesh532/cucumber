@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Create a new customer
    Given User is in the homepage of
    And User click on the add buttons
    When User will enter the details"<fname>","<lname>","<mail>","<add>","<mobile>"
    And User will click on the submit buttons
    Then I validate the outcomes
    And User will validate whether customer id is generatedd

    Examples: 
      | fname   | lname | mail              | add      | mobile     |
      | Vignesh | Babu  | vignesh@gmail.com | Salem    | 9790230532 |
      | Vicky   | B     | vicky@gmail.com   | Chennai  | 9790230531 |
      | Kumar   | V     | v@gmail.com       | Kangeyam | 1234567890 |
