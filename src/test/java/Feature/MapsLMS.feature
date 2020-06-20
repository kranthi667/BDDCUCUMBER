Feature: LMS contacts creation

Scenario: LMS contacts scenario


Given Open LMS URL
When Enter username and password
|Username|Password|
|569730|Ipru@123|
Then click on contact page
Then create 3 contacts 

