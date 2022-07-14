Feature: Contacts

  @Regression
  Scenario: User should be able to create a contact and verify it is created
    Given when I launch contacts app
    When I click on plus icon to create app
    When I enter "RandomFirstName" as first Name
    When I enter "RandomSecondName" as second Name
    When I enter "RandomPhoneNumber" as phone number
    When I click on "Save" button
    Then I verify contact created
    When I navigate back
    When I search for contact
    Then I verify contact created in search results
    
    
    
   
  
