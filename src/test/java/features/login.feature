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

  #  Scenario: login with invalid credential when username And Password is incorrect
#    Given user is on login page
#    When user enter invalid username
#    And user enter invalid password
#    And user click on login button
#    Then verify the error message

   #Maruthi
  #  Scenario: login with invalid credential when username and  password is incorrect
#    Given user is on login page
#    When user enter invalid username
#    And user enter password
#    And user click on login button
#    Then verify the error message