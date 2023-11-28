Feature: User Registration

  Scenario: Register with mandatory field
    Given User navigates to Register account page
    When User enters First Name in First Name text box
    And User enters last name in Last name text box
    And User enters email in email text box
    And User enters telephone number in telephone text box
    And User enters password "Abcd1234" in Password text box
    And User enters confirm Password "Abcd1234" in Password confirm text box
    And User clicks on Privacy Policy  check box
    And User clicks on Continue button
    Then User should create account successfully

  Scenario: Register with all field
    Given User navigates to Register account page
    When User enters First Name in First Name text box
    And User enters last name in Last name text box
    And User enters email in email text box
    And User enters telephone number in telephone text box
    And User enters password "Abcd1234" in Password text box
    And User enters confirm Password "Abcd1234" in Password confirm text box
    And User selects Yes for Newsletter
    And User clicks on Privacy Policy  check box
    And User clicks on Continue button
    Then User should create account successfully

  Scenario: Register without providing ant fields
    Given User navigates to Register account page
    When User do not enter any info in any fields
    And User clicks on Continue button
    Then Warning message will be displayed for all mandatory fields

  Scenario: Register with duplicate email address
    Given User navigates to Register account page
    When User enters First Name in First Name text box
    And User enters last name in Last name text box
    And User enters email "neelcosta@aol.com" in email text box
    And User enters telephone number in telephone text box
    And User enters password "Abcd1234" in Password text box
    And User enters confirm Password "Abcd1234" in Password confirm text box
    And User selects Yes for Newsletter
    And User clicks on Privacy Policy  check box
    And User clicks on Continue button
    Then Warning message will display for duplicate email





