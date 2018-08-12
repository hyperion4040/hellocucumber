Feature: Absolute value
    # As a user I want to enter value so that I can get absolute value

  Scenario: Absolute value for positive number (uid:b4d80dc7-53af-466b-87ad-7ef42a3dc5ef)
    Given entered value
    When value is positive
    Then returned values is positive

  Scenario: Absolute value for negative value (uid:31be11c9-2e95-406d-93cd-cb479bd6c4b4)
    Given entered value
    When value is negative
    Then returned values is positive
