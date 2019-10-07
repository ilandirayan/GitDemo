Feature: Login into applicatin

Scenario Outline: positive test login validation
Given Initialize the chrome browser
And navigate to "http://www.qaclickacademy.com/" site
And click on login button in homepage to secure signin page
When users enters <username> and <password>
Then verify the user loggin succussfully
And close the browser

Examples:
|username        |password|
|test99@gmail.com|123456  |
|test89@gmail.com|456789  |

