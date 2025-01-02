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

Feature: Notifications and Updates

  Scenario: Notify clients about changes to program schedules
    Given iam loged in as instructor 
    When the system detects the schedule change
    Then the system should send a notification to the client about the updated schedule
    
  Scenario: Announce new programs to clients
    Given iam loged in as instructor
    When the system identifies clients who may be interested in the program
    Then the system should send an announcement to the clients
   

  Scenario: Notify clients about special offers
    Given iam loged in as instructor
    When the system sends notifications
    Then the client should receive a notification about the special offer
    
    
    