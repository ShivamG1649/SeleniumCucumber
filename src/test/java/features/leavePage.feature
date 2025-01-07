Feature: Verify leave page testCases
Background:
  Given User is on the landing page
  When enter valid userName
  And enter valid password
  And Click on signIn button

  @Sanity
  Scenario: verify the search functionality on the leave page
    And Navigate to leave page
    And fill all data as below table
    |2024-02-04|
    |2024-31-12|
    |Rejected|
    |CAN-FMLA|
    And Click on search button on leave page




