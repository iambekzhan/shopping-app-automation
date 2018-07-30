	Feature: Model class test
	
	@test
	Scenario: Creating an Account
	
		Given user goes to shopping homepage 
		Then user clicks on sign in button
		And user sends "cbt123@cbtmail.com" and clicks create an account button
		Then user completes all user info:
			|title		|Mr|
			|firstName	|James|
			|lastName	|Bond|
			|password	|jbond2018|
			|address	|123 main st|
			|city		|Chicago|
			|state		|Illinois|
			|zip		|60659|
			|mNumber	|7737737777|
		When user sends info:
			|likes	|comments	|date			|
			|123	|hello world|july-28-2-2018	|