Feature: Application login functionality
  Scenario: login with valid credentials
    Given user is on login page
    When user enter userName
    And user enter password
    And user click on login button
    Then verify that user logged in


#  Scenario: login with invalid credential when username is incorrect
#    Given user is on login page
#    When user enter invalid username
#    And user enter password
#    And user click on login button
#    Then verify the error message