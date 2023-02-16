Feature:Nhs Patient functionality tests

  Background:
    Given user navigates to the "http://www.techtorialacademy.link/app"

  Scenario: Positive Test the login functionality of Nhs Patient
    When enter the cridentials username "admin" and "admin"
    Then user should be in the main page of nhs patient


  Scenario: Negative Test the login functionality of Nhs Patient
    When enter the cridentials username "admin" and "12554587465874543"
    Then user should stay in the Login Page