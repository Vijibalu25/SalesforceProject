Feature: Edit Task in Salesforce Application


#Given Launch the Browser
#And load the URL

Scenario: Edit Task

Given Enter the username as 'gokul.sekar@testleaf.com'
And Enter the password as 'Leaf$123'
When Click on Login
Then Homepage will be displayed
When Click on Global Actions SVG icon
And Click view all
And Click Sales from from App Launcher
And Click on Tasks tab 
And Click on Dropdown icon available under tasks
And select value as Recently viewed
And Select todays date as Due date
And Select Priority as low
And Click on Save
Then verify the Task created Subject