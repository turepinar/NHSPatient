Feature: Validate dashboard tables

  Background:
    Given Admin user navigates to NHS website 'http://www.techtorialacademy.link/'
    When The correct username and password is entered
    Then Login successfull by validating title 'NHS patients'

  @Proj-T14
  Scenario: Verify tables are displayed on dashboard
    Then validate tables are displayed

  @Proj-T15
  Scenario: Verify the number of tables as expected
    Then validate the number of the tables on the dashboard is 3


