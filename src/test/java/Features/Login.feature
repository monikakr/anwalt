Feature: Login into Mediamarkt.de

  Scenario: Login with valid email and invalid password
    Given Navigate to 'https://www.mediamarkt.de/de/myaccount/auth/login?redirectURL=%2F' url.
#    When I accept cookies
    And I enter valid email
    And I enter invalid password
    And I click login
    Then I stay on the same page

