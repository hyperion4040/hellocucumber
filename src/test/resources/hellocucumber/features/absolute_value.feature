Feature: Absolute value
    # As a user I want to enter value so that I can get absolute value

  Scenario: Absolute value for positive number
    Given entered value
    When value is positive
    Then returned values is positive

  Scenario: Absolute value for negative value
    Given entered value
    When value is negative
    Then returned values is positive
