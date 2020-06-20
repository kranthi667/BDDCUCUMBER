@functionalTest
Feature: LMS Functional testing


@SmokeTest @RegressionTest @End2EndTest
Scenario: Opne LMS 
Given Open URL and click on sign in


@SmokeTest @RegressionTest @End2EndTest
Scenario: Lms login detais
Given Enter username and password

@RegressionTest
Scenario: Lms contact details 
Given click on contact tab
When create new contact

@SmokeTest
Scenario: Lms investment details
Given click on investment details
@End2EndTest
Scenario: Lms term pasa
Given click on term pasa
@SmokeTest
Scenario: Lms Attendance 
Given mark attendance 
@RegressionTest
Scenario: Lms appointment
Given click appointment tab





