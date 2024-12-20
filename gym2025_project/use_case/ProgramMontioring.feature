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

Scenario: no enrollments
Given i am admin 
When i clic to view stitic on the most popular program
And i found no enrollment 
Then must be "no enrollments in this program "

Scenario: Generate reports on revenue 
Given  i am admin 
When i clic to generate report on revenue
Then it must dis report on revenue 

Scenario: Generate reports on  attendance
Given  i am admin 
When i clic to generate report on  attendance
Then should dis preport on  attendance

Scenario: Generate reports on client progress
Given  i am admin 
When i clic to generate report on client progress
Then i shoud disp report on  client progress


Scenario: Track active  programs
Given i am admin
When i clic on track active programs 
Then i should dis list of active program

Scenario: no active program 
Given i am admin
When i clic on track active programs 
And i am found no active program 
Then he  see "no active program"

Scenario: Track completed programs
Given i am admin
When i clic on track completed programs 
Then i see list of completed program

Scenario: no completed program 
Given i am admin
When i clic on track completed programs 
And i am found no completed program 
Then see "no completed program"
