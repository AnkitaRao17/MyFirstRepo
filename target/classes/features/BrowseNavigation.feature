

Feature: To check BrowserNavigation functionality

  @BrowserNavigation&dropdown
  Scenario: Refresh & Backward navigation of browser 
    Given enter url for browser navigation
   
    When Navigate to another url
    And navigate to backward
    And navigate to refresh
    Then I validate the backward navigation.
   

 @BrowserNavigation&dropdown
  Scenario: Refresh & Forward navigation of browser
    Given enter url for Forward browse navigation
  
    When Navigate to another url
    And navigate to backward 
    And navigate to forward
    Then I validate the Forward navigation.
    
 @BrowserNavigation&dropdown
   Scenario: Single option selection from dropdown
    Given enter url for Dropdown selection
  
    When select option from dropdownlist.
    Then I validate the correct option selection.
    
   @BrowserNavigation&dropdown
   Scenario: Multiple option selection from dropdown
   
    Given enter url for Dropdown selection
    When select option from dropdownlist.
    And  Getting all  option from dropdownlist.
    Then I validate the option selection.
    
  