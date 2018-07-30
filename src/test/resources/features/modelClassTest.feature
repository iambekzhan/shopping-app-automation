	Feature: Model class test
	
	Scenario: Testing the model class, custom data type
		Given user logs into application
		Then user creates account for user info:
		| title 	| first name 	| last name 	| phone number 	|
		| Mr		| John		 	| Doe		 	| 7737737777	|
		| Mrs		| Emily			| Smith			| 3123123222	|
		And user verifies stuff
		
	@pojo_type
	Scenario Outline: Testing the model class, custom data type
		Given user logs into application
		Then user creates account for user info:
		| title 	| first name 	| last name 	| phone number 	|
		| <title>	| <firstName> 	| <lastName>	| <phoneNumber>	|
		And user verifies stuff
		
		Examples:
		| title 	| firstName 	| lastName	 	| phoneNumber 	|
		| Mr		| John		 	| Doe		 	| 7737737777	|
		| Mrs		| Emily			| Smith			| 3123123222	|	