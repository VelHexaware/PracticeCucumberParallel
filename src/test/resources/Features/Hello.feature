Feature: Verifying the facebook details 

Scenario Outline: Verifying  login details with invalid credentials 
	Given User is on facebook page 
	When User enters "<userName>" , "<password>" 
	And User should click the login button 
	Then verify success message 
	
	Examples: 
		| userName | password |
		| Bala    | Guna     |
		