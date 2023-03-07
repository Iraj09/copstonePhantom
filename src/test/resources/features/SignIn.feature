Feature: Sign In Feature

  @SignInTest
  Scenario: Verify user can sign in into Retail Application
    Given User is on reatil website
    When User click on sign in option
    And User enter email 'iraj.19@gmail.com' and password 'Tek@12345'
    And User click on login button
    Then User should be logged in into Account

  @CreatAccount @SignInTest
  Scenario: Verify user can create an Account into Retail Website
    Given User is on reatil website
    When User click on sign in option
    And User click on create new account button
    And User fill the Sighup information with below data
      | name    | email                  | password  | confirmPassword |
      | phantom | Takschool002@tekschool.us | Tek@12345 | Tek@12345       |
    And User click on signup button
    Then User should be logged into account page
