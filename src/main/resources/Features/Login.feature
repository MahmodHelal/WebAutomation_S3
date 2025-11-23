Feature: Login Functionality
  Scenario: Verify that user will redirect to secure area page when enter valid credentials
    Given user is on Login Page
    When  user enter valid credentials
    And click on login button
    Then user should be redirected to secure area page