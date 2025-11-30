Feature: Alerts Functionality

  Scenario: Verify that when user click on JS Alert then it will display alert message
    Given user on AlertsPage
    When user click on JS Alert
    And user submit alert
    Then user should see Result Text