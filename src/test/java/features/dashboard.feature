Feature: DashBoard features
  Scenario: verify all quick icons should be present on dashboard page
    Given user is on login page
    When user enter userName
    And user enter password
    And user click on login button
    Then verify that all quick icons available on dashBoard page

