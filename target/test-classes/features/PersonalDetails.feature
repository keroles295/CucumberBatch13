Feature: this is going to filling out all of the employee personal details
  Background:
    When user enters valid admin username and password
   And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option
    When user adds multiple employees from excel file using "employeeData" sheet and verify the employee has been added
@MyHW
 Scenario: fill out all the recently added employee

    When user finds the new employee and clicks on it
    Then user navigated to Personal Details and user clicks on edit button
    When user fills out all of the information
    And user clicks on add attachment
    When user attacths file and add comment
    And user clicks on upload button
    And user clicks on save button to save all of the information
    Then user be abled to verify that all information has been added






