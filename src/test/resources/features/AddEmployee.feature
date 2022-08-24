Feature: This feature is going to add employee in HRMS application

  Background:
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option



  @smoke
  Scenario: Add an employee

    When user enters firstName, middleName and lastName
    And user clicks on save button
    Then employee add successfully
  @Test
  Scenario: Adding an employee from cucumber feature file

    When user enters "pito" , "nazeer" and "botros"
    And user clicks on save button
    Then employee add successfully

  @dataprovider
  Scenario Outline: Adding multiple employees from cucumber feature file
    When user enter "<firstName>" , "<middleName>" and "<lastName>"
    And user clicks on save button
    Then employee add successfully
    Examples:
      |firstName|middleName|lastName|
      |romi    |Mpl        |zari   |
      |roka    |Mty        |elila   |
      |may     |tarint     |jazu    |
  @dataTable
  Scenario: Adding multiple employees using data table
    When user adds multiple employees and verify they are added
    |firstName |middleName |lastName |
    |pito      |zaky       |KB       |
    |fhk          |lkg           |NH       |
    |rtyu          |uyt           |MO       |

  @excel
  Scenario: Adding employees from excel file
    When user adds multiple employees from excel file using "employeeData" sheet and verify the employee has been added




