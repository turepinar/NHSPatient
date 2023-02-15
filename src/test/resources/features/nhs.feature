Feature:Nhs Patient functionality tests

  Background:
    Given user navigates to the "http://www.techtorialacademy.link/app"

  Scenario: Test the login functionality of Nhs Patient
    When enter the correct cridentials
    Then user should be in the main page of nhs patient

