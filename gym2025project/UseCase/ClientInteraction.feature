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

Feature:  Client Interaction

  Scenario: Communicate with enrolled clients via messaging
    Given i am logged in as instructor
    And client is enrolled in the system
    When the user sends a message to the client
    Then the client should receive the message

  Scenario: Communicate with enrolled clients via discussion forums
    Given  i am logged in as instructor
    And discussion forum is available for enrolled clients
    When the user posts a message in the forum
    Then all enrolled clients should be able to view the message
    And enrolled clients should be able to reply to the message

  Scenario: Communicate with enrolled clients via messaging or via discussion forums
    Given i am logged in as instructor
    And client is not enrolled in the system
    When the user sends a message to the client
    Then the i should see "no enrolled clients"
    
    Scenario: Provide written feedback to a client
    Given i am logged in as instuctor
    And a client is enrolled in the system
    When the user writes feedback for the client
    Then the client should be able to view the feedback in their profile

    Scenario: Provide progress reports to a client
    Given i am logged in as instructor
     And a client is enrolled in the system
     And progress tracking data is available
     When the user generates a progress report for the client
     Then the client should receive the progress report