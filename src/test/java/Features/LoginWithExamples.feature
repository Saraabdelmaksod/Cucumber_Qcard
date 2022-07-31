Feature: Test The Login Functionality
  Scenario Outline: To Login with Invalid Criteria

   Given User open The Website with More Data and go to Login Page
    When User fill email as "<username>" and "<password>" and click on login Examples
    Then Error Message should appear

   Examples:
     | username                |password|
     |     tomsmith            |     InvalidPassword   |
     |    InvalidUser          |     InvalidPassword   |
     |    InvalidUser      |     SuperSecretPassword!   |