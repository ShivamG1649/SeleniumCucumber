Feature: Application login
  Scenario: login in application
    Given User is on the landing page
    When user login into application
    Then home page is displayed
