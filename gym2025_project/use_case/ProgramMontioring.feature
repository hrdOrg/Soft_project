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

Feature: program monitoring 
Scenario: Admin View statistics on the most popular programs by enrollment
Given i am admin 
When i clic to view stitic on the most popular program
Then  must show list of statistics 


Scenario: Generate reports on attendence and client progress
Given  i am admin 
When i clic to generate report on attendence and client progress
Then it must dis report on attendence and client progress


Scenario: Track active and completed programs
Given i am admin
When i clic on track active and completed programs 
Then i should dis list of active program

