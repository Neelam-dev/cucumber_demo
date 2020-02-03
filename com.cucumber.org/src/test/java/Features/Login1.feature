Feature: High level requirement of verify Vnext website

#demo
@demo1
Scenario: check login feature


Given user is on login page
When Enter username and password
And Click on login button
Then login should be done successful

@demo2
Scenario: check sign up feature

Given user is on Home page
When click on sign up link
Then display registration page

