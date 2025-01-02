Feature: Client Features in Fitness Management System
the client do not have an account 

Scenario: a new client success to creates a new account 
Given the client inter thier "name" , "email" , "password" , "gender" and "age"
When the client pressed sign up
Then create a new account with the said informations

Scenario: a new client failed to creates a new account 
Given the client inter thier  "email" , "password" , "gender" and "age"
When the client pressed sign up
Then this massage should be displays "the name is missing" 

Scenario: a new client failed to creates a new account 
Given the client inter thier  "name" , "password" , "gender" and "age"
When the client pressed sign up
Then this massage should be displays "the email is missing" 

Scenario: a new client failed to creates a new account 
Giventhe client inter thier  "email" , "name" , "gender" and "age"
When the client pressed sign up
Then this massage should be displays "the password is missing" 

Scenario: a new client failed to creates a new account 
Given the client inter thier  "email" , "password" , "name" and "age"
When the client pressed sign up
Then this massage should be displays "the gender is missing" 

Scenario: a new client failed to creates a new account 
Given the client inter thier  "email" , "password" , "gender" and "name"
When the client pressed sign up
Then this massage should be displays "the age is missing" 