Feature: Check the functionality of Dashboard

  Background:
    Given user navigates to the "http://www.techtorialacademy.link/"
    When logges in to website

  @Proj-T10
  Scenario: user should see the informations on the blue card
    Then should be able to see number of patient with room
    Then should be able to see title of "Patients with rooms"
    Then should be able to see hospital icon in the blue section

  @Expected
  Scenario:Check each card on dashboard display correct information
    Then The information cards show on the screen
      |Patients with rooms|
      |Patients waiting   |
      |Free rooms         |
    And validate the message on each card





