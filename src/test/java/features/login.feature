Feature: Application login functionality

  @OrangeHRM1
  Scenario: login with valid credentials
    Given user is on login page
    When user enter userName
    And user enter password
    And user click on login button
    Then verify that user logged in

  @OrangeHRM2
  Scenario: login with invalid credential when username is incorrect
    Given user is on login page
    When user enter invalid username
    And user enter password
    And user click on login button
    Then verify the error message

  @OrangeHRM3
  Scenario: login with invalid credential when password is incorrect
    Given user is on login page
    When user enter userName
    And user enter invalid password
    And user click on login button
    Then verify the error message

  @OrangeHRM4
  Scenario: login with invalid credentials when username and  password are incorrect
    Given user is on login page
    When user enter invalid username
    And user enter invalid password
    And user click on login button
    Then verify the error message

  @OrangeHRM5
  Scenario: Verify OrangeHRM Title
    Given user is on login page
    Then Verify title of the page

  @OrangeHRM6
  Scenario Outline: Verify Forgot Your Password link Functionality
    Given user is on login page
    When User clicked Forgot Your Password link
    And Verify user navigated to Reset Password page
    And User enter "<username>" and click on Reset password
    And Verify User navigated to Reset password Successful page

    Examples:
      | username |
      | ABC      |
      | 123      |
      | @#$      |
      | abc123&^ |

  @OrangeHRM7
  Scenario Outline: login functionality
    Given user is on login page
    When user enter "<userName>" and "<password>"
    And user click on login button
    Then verify that user logged in
    Examples:
      | userName |password|
      | Admin    | admin123  |
      | Admin1   | admin123  |
      | Admin    | admin1234 |
      | Admin1   | admin1234 |
