
Feature: OrangeHRM Login
  I want to use this template for my feature file

  Scenario: Logo presence on OrangeHRM
    Given I launch chrome browser
    When I open OrangeHRM homepage
    Then I verify that the logo is present on page
    And close browser