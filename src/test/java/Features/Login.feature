Feature: Test The Login Functionality
  Scenario: To Login with valid email and password
    Given User open The Website and go to Login Page
    When User fill email as "tomsmith" and "SuperSecretPassword!" and click on login
    Then User should navigate to home page

