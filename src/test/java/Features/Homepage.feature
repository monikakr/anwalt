Feature: Mediamarkt homepage
  
  Scenario: Open the outlet at Mediamarkt(failing test)
    Given Navigate to 'https://www.mediamarkt.de/' url.
    When I accept cookies
    And I click on Outlet
    Then I see Outlet page
