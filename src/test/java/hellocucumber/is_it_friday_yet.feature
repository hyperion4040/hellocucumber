# Created by hyperion at 11.08.18
Feature: Is it Friday yet
  Everyone wants to know if it is Friday.

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it is Friday yet
    Then I should be told "Nope"
