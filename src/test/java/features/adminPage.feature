Feature: Verify admin page functionality
  @Sanity
  Scenario Outline: Verify system user search for Admin and  ESS UserRoles
    Given User is on the landing page
    When enter valid userName
    And enter valid password
    And Click on signIn button
    And Click on admin link on left Side panel
    And Select Role "<UserRole>"
#    And Click on Search button

    Examples:
    |UserRole|
    |Admin|
    |ESS|
