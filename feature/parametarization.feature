Feature: Login Action
Scenario Outline: Succesful Login with credentials
Given User opens the apllication
When User click on signin link
And User enters  "<username>" and "<password>"
Then Message displayed Login Succesfully

Examples:
| username | password 	 |
| lalitha  | password123 |
| admin 	 | password456 |