Feature: Testing the booking functionality of the Adactin Hotel Booking application

Scenario Outline: User Checking the functionality of login page
     
     

Given  User must launch the login page 
When  User enter the valid username "<username>"
And  User enter the valid password "<password>"
Then  User confirming the login and move to next functionality
 
 Examples:
    |username|password|
    |gobikrish|8778875@|
    |Gobikrish|877887584|





Scenario: User checking all the necessary fields to search a hotel using valid datas

Given  User should  press the login button 
When  User  select a location from the dropdown box
And   User  pick the specific hotel using the dropdown
And   User select the roomtype 
And  User  choose particular number of rooms 
And  User  fill the Check-in date in the check-in field
And  User  enter the Check-out dates ,in the check-out field
And  User select the number of adults per room using dropdown 
And  User pick  number of children per room under the dropdown area
Then User Confirm the datas and naviate to the select hotel page

Scenario: User Checking the functionality for selecting a hotel

Given User must press the search button
When  user click the checkbox to select a hotel 
Then User confirm it and navigate to book a hotel page


Scenario: user checking book a hotel functionality using various valid information

Given User must click the continue button 
When  User enter the firstname in the firstname field
And   User fill the lastname  in the lastname field
And   User feed the address in that billing address field
And   User enter the card number in credit card no field 
And   User select the credit card from select credit card dropdown
And   User pick the expiry month from select month dropdown
And   User choose the expiry year from select year dropdown
And   User enter CCV number in the CVV Number field
Then  User confirm all the fields and get through booking confirmation page

Scenario: User checking the functionality of logout page

Given  User must click the BookNow button
Then   User Must press the logout button