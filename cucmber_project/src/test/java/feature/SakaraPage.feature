Feature: Request an Appointment

  @sakara
  Scenario Outline: Book an Appointment
    Given User Launch Chrome Browser
    When the User opens "https://www.sakraworldhospital.com/request-appointment"
    And User Click On Dr. Shishir Chandrashekhar
    And User click on the Consultation button
    And Request an Appointments page is displayed
    And User enters the name <name>
    And User enters the Email <Email>
    And User enters Mobile Number <Mobile number>
    And User selects gender from the Gender dropdown
    And User selects the Date of Birth
    And User selects Preferred Date1
    And User selects Preferred Date2
    And User selects the I am not a robot checkbox
    Then User clicks on the Submit button

    Examples: 
      | name | Email              | Mobile number |
      | jon  | jon@mailinator.com |    9658893634 |
      | sam  | sam@mailinator.com |    9658893634 |

  @sakara
  Scenario: Centre and Specialites page
    Given User clicks on Centres and Specialites page
    Then Page with heading Centres & Specialities "Centres & Specialities" will display

  @sakara
  Scenario: Visit to Patient care page
    Given User clicks on Patient care
    Then Patient Info "Patient Info" heading will diaplay

  @sakara
  Scenario: Visit to International patients page
    Given User clicks on International patients
    Then International Patient Services "International Patient Services" heading will diaplay

  @sakara
  Scenario: Visit to Nursing page
    Given User clicks on Nursing
    Then NURSING DEPARTMENT OF SAKRA "NURSING DEPARTMENT OF SAKRA" heading will display
