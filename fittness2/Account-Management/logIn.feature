Feature: Client Features in Fitness Management System
Scenario: Successful login
Given client inter the "username" and "password"
And client click the login buttom
Then client should be taken to the personal page  

Scenario: unSuccessful login
Given client inter the false "username" and "password"
And client click the login buttom
Then this massage should be displays "the username is wrong"  

Scenario: unSuccessful login
Given client inter the "username" and false "password"
And client click the login buttom
Then this massage should be displays "the password is wrong"  

 Scenario: unSuccessful login
Given client inter the  "password"
And client click the login buttom
Then this massage should be displays "the username is required" 
 
 Scenario: unSuccessful login
Given client inter the "username" 
And client click the login buttom
Then this massage should be displays "the password is required"  