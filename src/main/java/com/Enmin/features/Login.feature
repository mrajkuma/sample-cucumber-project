Feature: Login scenarios validation
  Background:
    Given I launch the browser
    And Navigate to provided url
    Then I load the url successfully


  @automationexcercisetests
  Scenario: Test Case 1: Register User
    Given I click on " Signup / Login" link in header section
    And I am taken to the signup page
    When I enter name as "tester2" and email address as "testcucumber2@test.com"
    And I click the "Signup" button
    Then I am taken to "Enter Account Information" page
    And I input value "Mr" for "radio" field "Title"
    And I verify field "Name " of type "text" has value "tester2"
    #And I verify hidden field "Email " of type "text" has value "testcucumber1@gmail.com"
    And I input value "Password123" for "password" field "Password "
    And I select value "7" for "list" field "Day";
    And I select value "7" for "list" field "Month";
    And I select value "1991" for "list" field "Year";
    And I input value "checked" for "checkbox" field "Sign up for our newsletter!"
    And I input value "checked" for "checkbox" field "Receive special offers from our partners!"
    And I input value "tester3" for "text" field "First name "
    And I input value "last3" for "text" field "Last name "
    And I input value "test company" for "text" field "Company"
    And I input value "30 test road" for "text" field "Address "
    And I input value "Thane street" for "text" field "Address 2"
    And I input value "Maharashtra" for "text" field "State "
    And I input value "Mumbai" for "text" field "City "
    And I input value "600078" for "text" field "Zipcode "
    And I input value "9798799001" for "text" field "Mobile Number "
    And I click the "Create Account" button
    Then I am taken to "Account Created!" page
    And I click the "Continue" button