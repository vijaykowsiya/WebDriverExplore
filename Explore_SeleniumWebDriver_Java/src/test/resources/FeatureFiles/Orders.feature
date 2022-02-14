Feature: Checking Orders details


Background: 
Given Existing User registered in Amazon.in
And User is on login page
When User entered Username and Password and Clicked Login button
And User clicked Returns and Orders and navigates to Orders page

Scenario: Check Orders tab details
Then Order tab is selected by default and order details displayed

@Smoke
Scenario: Check Orders tab details
When User clicked Buy Again tab
Then Previous Ordered Products displayed

@Regression
Scenario: Check Orders tab details
When User clicked Not Yet Shipped tab
Then Pending orders displayed

@Progression
Scenario: Check Orders tab details
When User clicked Cancelled Orders tab
Then Cancelled orders displayed