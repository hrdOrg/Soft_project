#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Sign In Functionality

  Scenario: User successfully signs in to the program
    Given a user wants to sign in
    When they click on sign_in 
    And they enter "rama@gmail.com" as his_email
    And they enter "1312" as his_password
    Then they see a message "Sign-in successful"

  Scenario: User enters an incorrect email
    Given a user wants to sign in
    When they click in sign_in 
    And they enter "heba@gmai.com" as wrong his_email
    And they enter "131122" as hispassword
    Then we see a message "Wrong email. Try again."

  Scenario: User enters an incorrect password
    Given a user wants to sign in
    When they click to sign_in
    And they enter "dania@gmail.com" as hisemail
    And they enter "1311334" as incorrect his_password
    Then you see a message "Wrong password. Try again."
