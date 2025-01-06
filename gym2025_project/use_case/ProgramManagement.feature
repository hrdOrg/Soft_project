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



Scenario: update program information1
Given I WANT TO UPDATE PrOgRaM 
When I CLIC to PrOgRaM UPDATE1
Then THE DuRaTion must BE updated

Scenario: update program information2
Given I WANT TO UPDATE PrOgRaM 
When I CLIC to PrOgRaM UPDATE2
Then THE LEveL must BE updated

Scenario: update program information3
Given I WANT TO UPDATE PrOgRaM 
When I CLIC to PrOgRaM UPDATE3
Then THE GoOlS  must BE updated


Scenario: update program information4
Given I WANT TO UPDATE PrOgRaM 
When I CLIC to PrOgRaM UPDATE4
Then THE LiNK must BE updated

Scenario: update program information5 
Given I WANT TO UPDATE PrOgRaM 
When I CLIC to PrOgRaM UPDATE5
Then THE PrICE   must BE updated

Scenario: program not found 
Given I WANT TO UPDATE PrOgRaM 
When I CLIC to PrOgRaM UPDATE6
Then THE pRoGrAm must BE Not updated


Scenario: Create fitness programs 
Given i am logged in as instructor
When i clic in creat fitness program1 
And i enter "stringlifts" as program titel
And i enter "one month" as duration
And i enter "easy" as difficulty level
And i enter  "losse 5kg" as goals 
And i upload video tutorial or image or document 
And i set "50 NIS" as price 
Then I Should see "program added"

Scenario: fitness programs already exists
Given i am logged in as instructor
And  program titel "stringlifts" already exist 
When i clic in creat fitness programs2 
And i enter "stringlifts" as program titel
And i enter "one month" as duration
And i enter "easy" as difficulty level
And i enter  "losse 5kg" as goals 
And i upload video tutorial or image or document 
And i set "50 NIS" as price 
Then i See "program already exist"

Scenario: Fail to Add a User with Missing Required Fields
 Given i am logged in as instructor
 When i clic in creat fitness programs3 
 And i leave program titel empty
 And i enter "one month" as duration
 And i enter "easy" as difficulty level
 And i enter  "losse 5kg" as goals 
 And i upload video tutorial or image or document 
 And i set "50 NIS" as price 
 Then I SHould see "program titel is required. Please enter a program titel." 

 Scenario: Fail to Add a User with Missing Required Fields
 Given i am logged in as instructor
 When i clic in creat fitness programs3 
 And  i enter "stringlifts" as program titel
 And i leave duration empty
 And i enter "easy" as difficulty level
 And i enter  "losse 5kg" as goals 
 And i upload video tutorial or image or document 
 And i set "50 NIS" as price 
 Then I SHould see "duration is required. Please enter a duration." 

Scenario: Fail to Add a User with Missing Required Fields
 Given i am logged in as instructor
 When i clic in creat fitness programs3 
 And  i enter "stringlifts" as program titel
 And  i enter "one month" as duration
 And i leave difficulty level empty
 And i enter  "losse 5kg" as goals 
 And i upload video tutorial or image or document 
 And i set "50 NIS" as price 
 Then I SHould see " difficulty level is required. Please enter a difficulty level." 

Scenario: Fail to Add a User with Missing Required Fields
 Given i am logged in as instructor
 When i clic in creat fitness programs3 
 And  i enter "stringlifts" as program titel
 And  i enter "one month" as duration
 And  i enter "easy" as difficulty level
 And i leave goals empty
 And i upload video tutorial or image or document 
 And i set "50 NIS" as price 
 Then I SHould see " goals is required. Please enter a goals." 



Scenario: Fail to Add a User with Missing Required Fields
Given i am logged in as instructor
When i clic in creat fitness programs3 
And i enter "stringlifts" as program titel
And i enter "one month" as duration
And i enter "easy" as difficulty level
And i enter  "losse 5kg" as goals
And i dont upload video tutorial or image or document 
And i set "50 NIS" as price 
Then I SHould see " video tutorial or image or document is required. Please enter a video tutorial or image or document"
 
 
Scenario: delete fitness program
 Given I am logged in as an instructor
 And the  program titel "stringlifts" that i want to delete this fitness program
 When I am clic in delete
 Then I should SEE "the fitness program is deleted"
 
 Scenario: Set a schedule for an online group session  
 Given I am logged in as an instuctor     
 When a fitness program titled "Yoga Basics" exists
 And i clic creat new schedule 
 And I add a new session with the date "2024-12-10"  
 And I set the time to "6:00 PM"  
 And I choose the session type as "Online"  
 And I provide a meeting link "https://example.com/session"    
 Then the schedule for the online group session should be created successfully  
  

