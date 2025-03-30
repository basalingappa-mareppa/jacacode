
Feature: Application login

Scenario: Admin page default login

Given user is on netbanking landing page
When user login into the appication with "admin" and password "123"
Then home page is displayed 
And cards are displayed 

#Reusable

Scenario: user page default login

Given user is on netbanking landing page
When user login into the appication with "user" and password "0953"
Then home page is displayed 
And cards are displayed 

Scenario Outline: user page default login multiple user

Given user is on netbanking landing page
When user login into the appication with "<username>" and password "<password>"
Then home page is displayed 
And cards are displayed

Examples: 
| username | password |
| basaling | 1234     |
| credituser | lof243   | 