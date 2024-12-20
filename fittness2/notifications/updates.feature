Feature: updates

Scenario: Client enrolls in a fitness program
    Given the client has browsed the programs
    When the client selects a program and enrolls in it
    Then the system should confirm the client's enrollment in the program

Scenario: Client receives program schedule updates
    Given the client is enrolled in a program
    When there are changes to the program schedule
    Then the system should notify the client about the updated schedule

  Scenario: Client receives notifications about new programs and offers
    Given the client is logged in
    When a new program or special offer is available
    Then the system should notify the client about the new program or offer

  Scenario: Client receives motivational reminders
    Given the client is enrolled in a program
    When the client is about to miss a session or needs motivation
    Then the system should send a motivational reminder to the client