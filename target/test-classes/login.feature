Feature: Validating Login Functionality of the application

#  Scenario: User able to login into the application succuessfully
#    Given User navigates to the application page
#    When User provides login details
#    And  User clicks on login
#    Then User navigated to the Dashboard page


  Scenario Outline: User providing multiple testdata for login
    Given User navigates to the application page
    When User provides login details "<Userid>","<pwd>"
    And  User clicks on login
    Then User navigated to the Dashboard page
    Examples:
    |Userid |pwd  |
    |admin  |1234 |
    |Admin  |3456 |
    |12345  |erieh|
