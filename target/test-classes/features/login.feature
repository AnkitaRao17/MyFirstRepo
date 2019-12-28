Feature: to check login funcationality

@sanity14
Scenario: Login with valid credentials

Given user enter url
When user enter username
And user clicks on login btn
Then message should be displayed
