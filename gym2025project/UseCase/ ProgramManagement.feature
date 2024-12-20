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

Feature: program mangment

Scenario: Create fitness programs 
Given i am logged in as instructor
When i clic in creat fitness programs 
And i enter "stringlifts" as program titel
And i enter "one month" as duration
And i enter "easy" as difficulty level
And i enter  "losse 5kg" as goals 
And i upload video tutorial or image or document 
And i set "50 NIS" as price 
Then i should see "program added"

Scenario: fitness programs already exists
Given i am logged in as instructor
And  program titel "stringlifts" already exist 
When i clic in creat fitness programs 
And i enter "stringlifts" as program titel
And i enter "one month" as duration
And i enter "easy" as difficulty level
And i enter  "losse 5kg" as goals 
And i upload video tutorial or image or document 
And i set "50 NIS" as price 
Then i see "program already exist"

Scenario: Fail to Add a User with Missing Required Fields
 Given i am logged in as instructor
 When i clic in creat fitness programs 
 And i leave program titel empty
 And i enter "one month" as duration
 And i enter "easy" as difficulty level
 And i enter  "losse 5kg" as goals 
 And i upload video tutorial or image or document 
 And i set "50 NIS" as price 
 Then i should see "program titel is required. Please enter a program titel." 

 Scenario: Fail to Add a User with Missing Required Fields
 Given i am logged in as instructor
 When i clic in creat fitness programs 
 And  i enter "stringlifts" as program titel
 And i leave duration empty
 And i enter "easy" as difficulty level
 And i enter  "losse 5kg" as goals 
 And i upload video tutorial or image or document 
 And i set "50 NIS" as price 
 Then i should see "duration is required. Please enter a duration." 

Scenario: Fail to Add a User with Missing Required Fields
 Given i am logged in as instructor
 When i clic in creat fitness programs 
 And  i enter "stringlifts" as program titel
 And  i enter "one month" as duration
 And i leave difficulty level empty
 And i enter  "losse 5kg" as goals 
 And i upload video tutorial or image or document 
 And i set "50 NIS" as price 
 Then i should see " difficulty level is required. Please enter a difficulty level." 

Scenario: Fail to Add a User with Missing Required Fields
 Given i am logged in as instructor
 When i clic in creat fitness programs 
 And  i enter "stringlifts" as program titel
 And  i enter "one month" as duration
 And  i enter "easy" as difficulty level
 And i leave goals empty
 And i upload video tutorial or image or document 
 And i set "50 NIS" as price 
 Then i should see " goals is required. Please enter a goals." 



Scenario: Fail to Add a User with Missing Required Fields
Given i am logged in as instructor
When i clic in creat fitness programs 
And i enter "stringlifts" as program titel
And i enter "one month" as duration
And i enter "easy" as difficulty level
And i enter  "losse 5kg" as goals
And i dont upload video tutorial or image or document 
And i set "50 NIS" as price 
Then i should see " video tutorial or image or document is required. Please enter a video tutorial or image or document"
 
 
Scenario: delete fitness program
 Given I am logged in as an instructor
 And the  program titel "stringlifts" that i want to delete this fitness program
 When i clic in delete
 Then I should see "the fitness program is deleted"
 
 Scenario: Set a schedule for an online group session  
 Given I am logged in as an instuctor  
 And a fitness program titled "Yoga Basics" exists  
 When I select the "Schedules" section of the program  
 And I add a new session with the date "2024-12-10"  
 And I set the time to "6:00 PM"  
 And I choose the session type as "Online"  
 And I provide a meeting link "https://example.com/session"    
 Then the schedule for the online group session should be created successfully  
  

Scenario: Set a schedule for an in-person group session  
 Given I am logged in as an instuctor   
 And a fitness program titled "Strength Training" exists  
 When I select the "Schedules" section of the program  
 And I add a new session with the date "2024-12-12"  
 And I set the time to "7:30 PM"  
 And I choose the session type as "In-Person"  
 And I provide the location as "Fitness Studio A, Downtown"    
 Then the schedule for the in-person group session should be created successfully  
