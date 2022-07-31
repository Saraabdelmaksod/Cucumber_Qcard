Feature: Test Login
  @Regression
  Scenario: Login with Valid Data
    Given User open site and go to login page
    When user fill data as "tomsmith" and "SuperSecretPassword!" and click on login
    Then Success message will be displayed
  @Regression
  Scenario Outline: To Login with Invalid Criteria
    Given User open site and go to login page
    When user fill data as "<username>" and "<password>" and click on login
    Then Error Message will be displayed

    Examples:
      |     username            |     password               |
      |     tomsmith            |     InvalidPassword        |
      |    InvalidUser          |     InvalidPassword        |
      |    InvalidUser          |     SuperSecretPassword!   |