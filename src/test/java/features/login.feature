Feature: Application login functionality
  Scenario: login with valid credentials
    Given user is on login page
    When user enter userName
    And user enter password
    And user click on login button
    Then verify that user logged in


 #Sita
  #  Scenario: login with invalid credential when password is incorrect
#    Given user is on login page
#    When user enter invalid username
#    And user enter password
#    And user click on login button
#    Then verify the error message
  # Test