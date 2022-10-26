Feature: Verify the Login functionality

Scenario Outline:: Login with Valid Credentials 
Given Verify the Login Page Opened
And Enter the <<Username> and <Password>  
And Click Login button
Then Verify the Login button is Clicked

Examples:
|Username|Password|
|'Kannan@gmail.com'|'Kum@12345'|


  