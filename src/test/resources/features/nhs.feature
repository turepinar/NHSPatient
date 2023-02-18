Feature:Nhs Patient functionality tests

  Background:
    Given user navigates to the "http://www.techtorialacademy.link/app"

  @Proj-T1
  Scenario: Positive Test the login functionality of Nhs Patient
    When enter the cridentials username "admin" and "admin"
    Then user should be in the main page of nhs patient

  @Proj-T2
  Scenario: Negative Test the login functionality of Nhs Patient
    When enter the cridentials username "admin" and "invalid"
    Then user should stay in the Login Page

  @Proj-T2
  Scenario: Negative Test the login functionality of Nhs Patient
    When enter the cridentials username "invalid" and "admin"
    Then user should stay in the Login Page

  @Proj-T9
  Scenario: Negative Test the login functionality of Nhs Patient
    When enter the cridentials username "" and ""
    Then user should get error message as "please fill out this fields"