Feature: To vaildate login functionality  of facebook
Scenario: Validate with invalid username and invalid password
Given The user should launch the chrome Browser
When The user should type the url
And  The user should maximize the window 
And The User should type the invalid username and invalid password
And The User should click the login button
Then The user should navigate to incorrect credential page