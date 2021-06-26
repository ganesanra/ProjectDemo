# ProjectDemo

Java Demoproject with Maven

This is an sample project to demonstrate how to work with Selenium and cucumber for Java

Execution summary
 passed	1 scenarios
Duration	   14.382s 


You can use either plain text for the search or  cucumber tag expressions  to filter the output.

file:///Users/ganesan/eclipse-workspace/ProjectDemo/src/test/java/features/webautomationDemo.feature
Feature: Web automation of the demo site
Scenario: Adding the items to the cart
Given I add four different products to my wish list
When I view my wishlist table
Then I find total "4" selected items in my wishlist
When I search for the lowest price product
And I am able to add the lowest price item to my cart
Then I am able to verify the item in my cart


Running test
Go to your project directory from terminal and hit following commands

mvn test (defualt will run on local firefox browser)
mvn test "-Dbrowser=chrome" (to use any other browser)

Instruction to Run:
Please update your local driver path System.setProperty("webdriver.chrome.driver", "//Users//ganesan//Downloads//chromedriver") agasint step definition

Improvements:
1. We can add Dependency for driver handling downloaded inside respository
2. We can add more assertions to validate this scenario
3. We can add more scenario to split this scenairo and add more asertions
4. we can add threads for parallel execution using testng framework
5. we can add cross Browser testing
6. We can furthur add more base class to make this project more robust framework
