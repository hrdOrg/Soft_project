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

Feature:  Content Management
Scenario: Approve wellness articles, tips, or recipes shared by instructors
Given i am sign in as admain
When i clic show   wellness articles, tips, or recipes shared by instructors
And i agreed to them 
Then  see me "Approved"

Scenario:  reject wellness articles, tips, or recipes shared by instructors.
Given i am sign in as admain
When i clic show   wellness articles, tips, or recipes shared by instructors
And i  reject to them 
Then  show me "rejected"


Scenario:  Approve articles or tips shared on health and wellness
Given i am sign in as admain
When i clic show articles or tips shared on health and wellness
And i apporv to them 
Then display "Approved"


Scenario: show user feedback and complaints
Given i am sign in as admain
When i clic show user feedback and complaints
Then i should see list of user feedback and complaints
 
