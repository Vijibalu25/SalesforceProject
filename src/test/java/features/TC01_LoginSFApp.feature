Feature: Login into Salesforce Application

#Given Launch the Browser
#And load the URL

Scenario: Login with Valid Credentials


Given Enter the username as 'gokul.sekar@testleaf.com'
And Enter the password as 'Leaf$123'
When Click on Login
Then Homepage will be displayed