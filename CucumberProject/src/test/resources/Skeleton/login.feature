Feature: Login Feature
@valid
Scenario Outline:: Valid User Scenario
Given The URL of TestMe APP
When user enters <username> as username
And user enters <password> as password
Then user is in <page>

Examples:
|username	|paasword	|page	    |
|Lalitha	|Password123|Home	    |
|admin		|Password456|Admin Home	|

@invalid
Scenario: invalid scenario
Given The URL of TestMe APP
When user enters invalid data
|username|password|
|abcxyv|Password123|
|Lalitha|abc1223|
|abc123|abc123|
Then user is in loginpage
|bdc|
|ddc|
|hdc|
#Scenario: Valid Admin User Scenario
#Given The URL of TestMe APP
#When user enters "admin" as username
#And user enters "Password456" as password
#Then user is in home page