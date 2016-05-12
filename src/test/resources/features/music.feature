Feature: Spring music to manage Albums from collection

  Scenario: Delete existing Album from collection
    Given Album Brothers exists
    When  I remove Album Brothers
    Then Album Brothers can not be found

  Scenario: Create new Album in collection
    When  I search for Album Brothers
    Then Album Brothers exists

  Scenario: Create new Album in collection
    When  I add Album Brothers
    Then Album Brothers can be found

  Scenario: Update new Album in collection
    Given Album Brothers exists
    When I update Album year
    Then Album Brothers was updated