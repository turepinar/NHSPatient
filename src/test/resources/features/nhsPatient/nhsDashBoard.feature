Feature: Check the functionality of Dashboard

  Background:
    Given user navigates to the "http://www.techtorialacademy.link/"

    @Proj-T10
  Scenario:
    When logges in to website
    Then should be able to see number of patient with room


  Scenario:
    When logges in to website
    Then should be able to see title of "Patients with rooms"


  Scenario:
    When logges in to website
    Then should be able to see hospital icon in the Orange section

