Feature: Test Logout
  Scenario: Test Logout Functionality
    Given User open site and go to login page
    When user fill data as "tomsmith" and "SuperSecretPassword!" and click on login
    And User click on Logout Button
    Then username filed will be displayed