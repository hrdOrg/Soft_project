Feature: updates

Scenario: Client enrolls in a fitness program
    Given the client has browsed the programs
    When the client selects a program and enrolls in it
    Then the system should confirm the client's enrollment in the program

Scenario: Client receives program schedule updates
    Given the client is enrolled in a program
    When there are changes to the program schedule
    Then the system should notify the client about the updated schedule
