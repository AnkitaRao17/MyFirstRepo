Feature: Registration feature

Background: To generate db cnnection
Given user invoke browser
    
@smoke4
  Scenario: Registration with valid data
    When enter firstname
    And enter lastname
    When enter DOB
    And enter country
    And enter state
    Then registration successfully page should be displayed

 @smoke4 
  Scenario Outline: Registration with invalid data
    When enter firstname "<firstname>"
    And enter lastname "<lastname>"
    When enter DOB "<DOB>"
    And enter country"<country>"
    And enter state"<state>"
    Then registration successfully page should be displayed

    Examples: 
      | firstname | lastname | DOB         | country | state      |
      | ankita1   | rao1     | 12thjan1999 | india   | maharstra  |
