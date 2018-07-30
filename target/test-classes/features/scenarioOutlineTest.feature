	Feature: Shopping account creation with scenario outlines
	@createAccount
	Scenario Outline: Shopping account creation with scenario oulines
		Given user goes to shopping homepage 
		Then user clicks on sign in button
		And user sends "<email>" and clicks create an account button
		Then user chooses title "<title>"
		Then user completes first name "<firstName>"
		Then user completes last name "<lastName>"
		Then user completes password "<password>"
		Then user completes address "<address>"
		Then user completes city "<city>"
		Then user completes state "<state>"
		Then user completes zip "<zip>"
		Then user completes mobile number "<phoneNumber>"
		And user clicks register button
		Then user verifies "Welcome to your account. Here you can manage all of your personal information and orders."
		
		Examples:
		| title	| firstName	| lastName	| password	| address		| city		| state		| zip	| phoneNumber	| email					|
		| Mr	| James		| Bond		| jbond2018	| 123 main st	| Chicago	| Illinois	| 60659	| 3123123222	| cbt123@cbtmail.com	|
		| Mrs	| Emily		| Smith		| emily2018	| 608 river st	| Chicago	| Illinois	| 60665	| 7737473273	| emily123@cbtmail.com	|
		| Mr	| John		| Doe		| johndoe12	| 112 forest st	| Chicago	| Illinois	| 60639	| 3121234222	| jdoe12@cbtmail.com	|
		| Mr	| Alexa		| Amazon	| alexa18	| 324 adams st	| Chicago	| Illinois	| 60651	| 3135775222	| alexa43@cbtmail.com	|
		
		