
Feature: makemytrip e-commerse project check

  Background: Navigation to the URL
    Given User navigated to the home application url
    
  @tag1
  Scenario: selecting the perticular date from calender
   When user navigated to url "https://www.makemytrip.com/flights/"
  Then user can select the departure date
   
   @tag2
   Scenario: selecting the number of travellers
   When user navigated to url "https://www.makemytrip.com/flights/"
   Then user can select the ADULTS 2, CHILDREN  1, INFANTS 1
   
   @tag3
   Scenario: click on search button
  When user navigated to url "https://www.makemytrip.com/flights/"
   Then user can select the ADULTS 2, CHILDREN  1, INFANTS 1
   Then click on search button
   
   @tab4
   Scenario: Verify TRIP TYPE, FROM, TO, DEPART & PASSENGERS & CLASS
   When user navigated to url "https://www.makemytrip.com/flights/"
   Then user can select the ADULTS 2, CHILDREN  1, INFANTS 1
   Then click on search button
   And result should be TRIP TYPE is "One Way", FROM is "New Delhi, india", TO "Bengaluru, India", DEPART at "Wed, jun 1, 2022" & PASSENGERS & CLASS is "4Travellers,Economy"

   