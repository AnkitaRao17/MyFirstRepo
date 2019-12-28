
Feature: To check checkbox functionality

  @Checkbox
  Scenario: Single checkbox feature
    Given enter url for checkbox
 
    When click on checkbox
    Then I validate checkbox selection
   

  @Checkbox
  Scenario: multiple checkbox feature
    Given enter url for checkboxsec
 
    When  click on checkbox button
    Then I validate checkbox selection is done for all checkbox.
  
   

  