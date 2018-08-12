# Created by hyperion at 11.08.18
Feature: Is it Friday
  User wants to know if today is Friday

  Scenario Outline: Today is or is not Friday
    Given today is <day>
    When I ask is it Friday
    Then I should hear <answer>

    Examples:
      |day | answer |
      |"Friday"|"Yes"|
      |"Monday"|"No" |