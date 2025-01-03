Feature: Client Features in Fitness Management System
	customize profiles with the following options:
	Personal details (e.g., age, fitness goals).
	Dietary preferences or restrictions.
	
	 Scenario: Client customizes their profile
    Given THE1 client is logged in
    When the client1 add their profile with personal details like1 "age"
    Then the system should add the client's1 "age" successfully

    Scenario: Client customizes their profile
    Given THE2 client is logged in
    When the client2 add their profile with personal details like2  "fitness goals"
    Then the system should add the client's2 "fittness goals" successfully
    
    Scenario: Client customizes their profile
    Given THE3 client is logged in
    When the client3 delete their profile with personal details like3  "fitness goals"
    Then the system should delete the client's3 "fittness goals" successfully
    
    Scenario: Client customizes their profile
    Given THE4 client is logged in
    When the client4 add their profile with personal details like4  "dietary preferences"
    Then the system should add the client's4 "dietary preferences" successfully

Scenario: Client customizes their profile
    Given THE5 client is logged in
    When the client5 delete their profile with personal details like5 "dietary preferences"
    Then the system should delete the client's5 "dietary preferences" successfully


