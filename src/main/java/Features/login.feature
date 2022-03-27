Feature: PFCU Login Feature

Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of home page is ServiceNow Developers
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
#Then Close the browser


Examples:
	| username | password |
	| demo@decisionminds.com  | 4usonly! |


	Scenario Outline: Free CRM Login Test Scenario1

		Given user is already on Login Page
		When title of home page is ServiceNow Developers
		Then user enters "<username>" and "<password>"
		Then user clicks on login button
		Then user is on home page
		#Then Close the browser


		Examples:
			| username | password |
			| invalid@decisionminds.com  | 4usonly! |

