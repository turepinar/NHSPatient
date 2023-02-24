Feature: Validate the informations on the dashboard cards

  Background:
  Background:
    Given Admin user navigates to NHS website 'http://www.techtorialacademy.link/'
    When The correct username and password is entered

    @Proj-T13
    Scenario: Validate all card identifiers
      Then User should see the titles as listed in data table
        |Patients with rooms|
        |Patients waiting   |
        |Free rooms         |
      Then validate all titles are correct
