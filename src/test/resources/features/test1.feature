Feature: I want to test the app
  I want to use this to test the app 

  Scenario Outline: Login Functionality(App Should not login)
    Given I want to open the app
    Then I want to enter the <emailid>
    And I want  enter the <password>
    And I want to click on login button
    
    Examples:
   |emailid|password|
   |aditya.mallu1@gmail.com|Aditya@123|
   |aditya.mallu1@gmail.com|Aditya@234555|
   |test@123|Test@12345|
 
 		
 	Scenario Outline: Login Functionality 2(App should not login)
    Given I want to open the app
    Then I want to enter the <emailid>
    And I want  enter the <password>
    And I want to click on login button
    
     Examples:
    |emailid|password|
    |aditya.mallu1@gmail.com|Aditya@123|
    |aditya.sharma123@gmail.com|1234456@123|
    
Scenario Outline: Login Functionality 3(App Should login)
    Given I want to open the app
    Then I want to enter the <emailid>
    And I want  enter the <password>
    And I want to remember credentials
    And I want to click on login button
    
     Examples:
    |emailid|password|
  	|testorg10automationuser@mailinator.com|Pass@123|