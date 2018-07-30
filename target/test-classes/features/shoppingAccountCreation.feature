	Feature: Shopping Account Creation
	
	Scenario: Creating an Account
	
		Given user goes to shopping homepage 
		Then user clicks on sign in button
		And user sends "cbt123@cbtmail.com" and clicks create an account button
		Then user chooses title "Mr"
		Then user completes first name "James"
		Then user completes last name "Bond"
		Then user completes password "jbond2018"
		Then user completes address "123 main st"
		Then user completes city "Chicago"
		Then user completes state "Illinois"
		Then user completes zip "60659"
		Then user completes mobile number "7733123123"
		And user clicks register button
		Then user verifies "Welcome to your account. Here you can manage all of your personal information and orders."
		
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
		And user clicks register button
		Then user verifies "Welcome to your account. Here you can manage all of your personal information and orders."
		
		
		
		
		