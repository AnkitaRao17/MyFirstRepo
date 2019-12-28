
@tag
Feature: Test radio button functionality

  @smoke
  Scenario: single radio button
    Given user enter valid url
    When click on radio button
    And click on button
    Then I validate the selction


  @smoke
   Scenario: Double radio button
       Given user enter valid  url
    When click on second radio button
    And click on buttonsec
    Then I validate the selction of second radio button
  
