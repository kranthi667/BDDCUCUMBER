Feature: Free crm login feature

#without exaples keyword
#Scenario: Free crm login test scenario

#Given user is already on login page
#When title of Login page is free crm
#Then user enter "699-Q5187" and "Chaitran@12"
#And user clicks on login button

#with Examples keyword

Scenario Outline: Free crm login test scenario

Given user is already on login page
When title of Login page is free crm
Then user enter "<username>" and "<password>"
And user clicks on login button

Examples:
        
        |username | password |
        |699-Q5187|Chaitran@12|
        |699-Q5677|XXXXXXX|

