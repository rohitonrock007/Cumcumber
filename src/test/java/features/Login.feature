@U_Login
Feature: This feature would be used to design the login page of the application

  Background: Open the Application
    Given I have opened the application in browser

  @Sanity
  Scenario: Validate the successful login
    When I click on the login link
    And I enter username
    And I enter password
    And I click on the login Button
    Then I should be Landed on the home page

  @RegressionTest @Sanity
  Scenario: Validate the successful login using test data
    When I click on the login link
    And I enter username "abc@xyz.com"
    And I enter password  "pqr@1234"
    And I click on the login Button
    Then I should be Landed on the home page

  @RegressionTest @Rapid
  Scenario Outline: Validate the successful login using multiple test data
    When I click on the login link
    And I enter username "<username>"
    And I enter password  "<Password>"
    And I click on the login Button
    Then I should be Landed on the home page

    Examples: 
      | UserName    | Password |
      | abc@xyz.com | pqr@1234 |
      | xyz@abc,com | pqr@1234 |

  Scenario: Validate the Negative login using test data
    When I click on the login link
    And I enter username
    And I enter password
    And I click on the login Button
    Then I should get the error message "The email or password you have entered is invalid."
