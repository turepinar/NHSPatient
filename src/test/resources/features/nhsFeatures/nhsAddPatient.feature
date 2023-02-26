Feature: test the functionality of Add Patient

  Background:
    Given Admin user navigates to NHS website 'http://www.techtorialacademy.link/'
    When The correct username and password is entered

    Scenario: Validate Add Patient functionality works successfully
      When user clicks to the Add Patient section
      Then user should be able to input to the fields
      And user clicks on Add Patient button
      Then user should be able to see patient details in Dahsboard page Patient Waiting Table
