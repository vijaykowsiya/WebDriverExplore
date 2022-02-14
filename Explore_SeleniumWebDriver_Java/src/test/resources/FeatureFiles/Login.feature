@login
Feature: Search Google
Description: Googling sample for Cucumber Demo

@Valid_Login @outline
Scenario: Search Google with a valid keyword
Given User is on Google Home page
When Enter keyword "12" and Submit
Then Search Results of Selenium should display

@verify_bal @outline
Scenario: Verify Balance
Given the account balance is Rs 100.50
When the user withdraws Rs 50
Then the account balance should be Rs 50.50

