Feature: client filters the programs to certain specifications
the filters are (Difficulty level): Beginner, Intermediate, Advanced.
or (Focus area): weight loss,  muscle building,  flexibility. 

Scenario: the cleint filters programs by difficulty level
Given the client is logged in
When the client chooses a "Beginner" as a filter 
Then the system should display the programs that are for "beginners" 

Scenario: the cleint filters programs by difficulty level
Given the client is logged in
When the client chooses a "Intermediate" as a filter 
Then the system should display the programs that are for "Intermediate" 

Scenario: the cleint filters programs by difficulty level
Given the client is logged in
When the client chooses a "Advanced" as a filter 
Then the system should display the programs that are for "Advanced" 

Scenario: the cleint filters programs by focus area
Given the client is logged in
When the client chooses a "weight loss" as a filter 
Then the system should display the programs that are for "weight loss" 

Scenario: the cleint filters programs by focus area
Given the client is logged in
When the client chooses a "muscle building" as a filter 
Then the system should display the programs that are for "muscle building" 

Scenario: the cleint filters programs by focus area
Given the client is logged in
When the client chooses a "flexibility" as a filter 
Then the system should display the programs that are for "flexibility" 