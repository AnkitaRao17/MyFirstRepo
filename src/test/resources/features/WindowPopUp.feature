
Feature: To check window Popup functionality.

  @WindowPopUp
  Scenario: Switch to child window popup
    Given Enter url for window pop up handles
    When Click on button to open window popup
    And  Switch to particular child popup window
    Then I validate the correct child pop up window should be opened
  