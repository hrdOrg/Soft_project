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
Feature: Admin User Management


Scenario: fill user information
Given I WANT TO FIIL USER INFO
When I CHOICE FILLINFO
Then THE INFO HASS BEEN FILLED


Scenario: update user information1
Given I WANT TO UPDATE 
When I CLIC to UPDATE1
Then THE NAME must BE updated

Scenario: update user information2
Given I WANT TO UPDATE 
When I CLIC to UPDATE2
Then THE  EmAIL must BE updated

Scenario: update user information3
Given I WANT TO UPDATE
When I CLIC to UPDATE3
Then THE  PaSs must BE updated



Scenario: update user information5
Given I WANT TO UPDATE 
When I CLIC to UPDATE5
Then THE  AgE must BE updated

Scenario: update user information6
Given I WANT TO UPDATE 
When I CLIC to UPDATE6
Then THE  TyPe  must BE updated


Scenario: update user informationIN
Given I WANT TO UPDATE INSTRUCTOR
When I CLIC to UPDATE instructor1
Then THE NAME must BE updated22

Scenario: update user informationIN
Given I WANT TO UPDATE INSTRUCTOR
When I CLIC to UPDATE instructor2
Then THE  EmAIL must BE updated22

Scenario: update user informationIN
Given I WANT TO UPDATE INSTRUCTOR
When I CLIC to UPDATE instructor3
Then THE  PaSs must BE updated22



Scenario: update user informationIN
Given I WANT TO UPDATE INSTRUCTOR
When I CLIC to UPDATE instructor5
Then THE  AgE must BE updated22

Scenario: update user informationIN
Given I WANT TO UPDATE INSTRUCTOR
When I CLIC to UPDATE instructor6
Then THE  TyPe  must BE updated22


Scenario: user not in array
Given I w TO UPDATE 
When I CLIC to UPDATE instructor7
Then THE must BE notFounD


Scenario: Add accounts for clinet
Given I am logged in as an admin
When  when i clic in add account 
And  i enter "rama" as username 
And i enter 21 as age
And i enter "rama@gmail.com" as email
And i enter "1311" as password 
And i enter "0599999090" as numberphone
And i enter "clinet" as type of regester 
Then it will dispplay "added clinet  successfuly" 

Scenario: Add accounts for instructors
Given I am logged in as an admin
When  when i clic in add account 
And  i enter "dania" as username 
And i enter 21 as age
And i enter "dania@gmail.com" as email
And i enter "101100" as password 
And i enter "0599999880" as numberphone
And i enter "instuctor" as type of regester 
Then it will be dispplay "added instrctor  successfuly "

 Scenario: Fail to Add a User with an Existing numberphone
  Given I am logged in as an admin
  And the numberphone "0595597868" already exists
  When i clic in add account2  
  And  i enter "dania" as username 
  And i enter 21 as age
  And i enter "dania@gmail.com" as email
  And i enter "101100" as password 
  And i enter "0595597868" as numberphone
  And i enter "instuctor" as type of regester
  Then I need to seee "User already adedd"
  
   Scenario: Fail to Add a User with Missing Required Fields
    Given I am logged in as an admin
    When i clic in add account2  
    And  i enter "sara" as username 
    And i enter 25 as age
    And i enter "sara@gmail.com" as email
    And I leave the password field empty
    And i enter "0594497868" as numberphone
    And i enter "instuctor" as type of regester
    Then I should see "miss info"
 
  Scenario: Fail to Add a User with Missing Required Fields
    Given I am logged in as an admin
    When i clic in add account2  
    And  I leave the username field empty 
    And i enter 29 as age
    And i enter "lara@gmail.com" as email
    And i enter "12345" as password
    And i enter "05955977868" as numberphone
    And i enter "instuctor" as type of regester
    Then I should see "miss info"
   
    Scenario: Fail to Add a User with Missing Required Fields
    Given I am logged in as an admin
    When i clic in add account2  
    And  i enter "soad" as username
    And  I leave the age field empty 
    And i enter "soad@gmail.com" as email
    And i enter "12345" as password
    And i enter "05955977868" as numberphone
    And i enter "instuctor" as type of regester
    Then I should see "miss info"
    
     Scenario: Fail to Add a User with Missing Required Fields
    Given I am logged in as an admin
    When i clic in add account2  
    And  i enter "gana" as username
    And  i enter 30 as age
    And  I leave the email field empty 
    And i enter "12345" as password
    And i enter "05955977868" as numberphone
    And i enter "instuctor" as type of regester
    Then I should see "miss info" 
    
 
     Scenario: Fail to Add a User with Missing Required Fields
    Given I am logged in as an admin
    When i clic in add account2  
    And  i enter "masa" as username
    And  i enter 22 as age
    And  i enter "masa@gmail.com" as email
    And i enter "12345" as password
    And  i leave the phonenumber field empty 
    And i enter "instuctor" as type of regester
    Then I should see "miss info" 
 
  Scenario: Fail to Add a User with Missing Required Fields
    Given I am logged in as an admin
    When i clic in add account2  
    And  i enter "tala" as username
    And  i enter 20 as age
    And  i enter "tala@gmail.com" as email
    And i enter "123459" as password
    And  i enter "05955933368" as numberphone
    And i leave the type field empty
    Then I should see "miss info" 
   
  Scenario: delete account 
  Given I am logged in as an admin
  And the numberphone "0595597868" that i want to delete this account 
  When i clic in delete
  Then  want to see "the account is deleted"
     
  Scenario: Successfully approve a new instructor registration
    Given a new instructor registration request with email "newinstructor@example.com" is pending
    When I approve the registration request
    Then the instructor's account should be activated
    
    
  Scenario: View overall user activity statistics
    Given I am logged in as an admin
    When I navigate to the user activity dashboard
    Then I should see statistics like total logins, active users, and inactive users

  Scenario: View engagement statistics for a specific user
    Given I am logged in as an admin
    And a user with email "user@example.com" exists
    When I view the engagement details for this user
    Then I should see metrics like number of logins, programs enrolled, and messages sent


  Scenario: Attempt to view activity for a non-existent user
    Given I am logged in as an admin
    And no user with email "nonexistentuser@example.com" exists
    When I try to view the engagement details for this user
    Then I should see an error message "User not found"

    
    
    
    
    
    
    
    
    