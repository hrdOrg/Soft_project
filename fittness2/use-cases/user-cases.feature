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

Feature: Subscription Management 

Scenario: add to subscription plans for clients and instructors 
Given i am logged in as admain of gym
When  i am clic in add  to subscription plans for clients and instructors 
Then i see "added"

Scenario: delete from subscription plans for clients and instructors 
Given i am logged in as admain of gym
When  i am clic in delete from subscription plans for clients and instructors 
And i chose what i wanted to delete
Then it will display "deleted"

Scenario: update into subscription plans for clients and instructors 
Given i am logged in as admain of gym
When  i am clic in update into subscription plans for clients and instructors 
And i chose what i wanted to update
Then i need to see "updated"

Scenario: show subscription plans for clients and instructors 
Given i am logged in as admain of gym
When  i am clic in show subscription plans for clients and instructors 
And i chose what subscription plans
Then i should put this user in this level