Feature: Is it Friday
    # User wants to know if today is Friday

  Scenario: admin account restrictions
    Given regular user account
    When user try to log in to admin account
    Then view restrictions message

  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When I ask is it Friday
    Then I should hear "<answer>"

    Examples:
      | day | answer | hiptest-uid |
      | "Friday" | "Yes" |  |
      | "Monday" | "No" |  |
