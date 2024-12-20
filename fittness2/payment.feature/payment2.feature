Feature: payment

Scenario: Client manages their subscription plan
    Given the client is logged in
    When the client views and updates their subscription plan
    Then the system should display the updated subscription details

  Scenario: Client makes a payment for a program
    Given the client is enrolled in a program
    When the client proceeds to make a "payment for the program"
    Then the system should process the payment successfully and confirm enrollment
