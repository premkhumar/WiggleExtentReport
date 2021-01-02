Feature: Verifying the login functionality of wiggle

  Scenario Outline: Successfull login with valid credentials
    Given User is on the adactin login page
    When User enters the valid username and password and click login
      | username     | password |
      | dxpremkhumar | test123  |
    Then Search Hotel page to be displayed
