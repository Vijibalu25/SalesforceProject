Feature: Create Task in Salaesforce Application


#Given Launch the Browser
#And load the URL
Scenario Outline: Create Lead with multiple set of Data

Given Enter the username as 'gokul.sekar@testleaf.com'
And Enter the password as 'Leaf$123'
When Click on Login
Then Homepage will be displayed
When Click on Global Actions SVG icon
And Click view all
And Type task and select task
And Click New Task under dropdown icon
And Enter subject <subject>
And Select status as 'Waiting on someone else'
And Click on Save
Then verify the Task created message

Examples:
|subject|
|Selenium Apr Batch-Created By Vijayalakshmi|
|Bootcamp|