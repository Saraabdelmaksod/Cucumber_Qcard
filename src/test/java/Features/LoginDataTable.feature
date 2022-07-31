Feature: Test The Login2 Functionality
  Scenario: To Login2 with valid email and password
    Given User open The Website and go to Login2 Page
    When User fill email  and password and click on login2
         |tomsmith|SuperSecretPassword!|

    Then User should navigate to home2 page