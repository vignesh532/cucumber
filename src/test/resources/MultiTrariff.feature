@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Passing Multiple Parameter
    Given User is in the homepages
    And User click on the Add tariff buttons
    When User is entering the details"<monRent>","<flmin>","<fim>","<fsp>","<lpmc>","<ipmc>","<spc>"
    And User is clicking on submitt
    Then User verify the tariff plan is added sucessfullys

    Examples: 
      | monRent | flmin |  | fim |  | fsp | lpmc | ipmc | spc |
      |     500 |    50 |  |  20 |  |  10 |    5 |   10 |   3 |
      |     400 |    30 |  |  15 |  |  20 |   10 |    4 |   2 |
      |     200 |    60 |  |  30 |  |   5 |    7 |    2 |   1 |