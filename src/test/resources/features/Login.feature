Feature: Deal data creation

  Scenario: Free CRM Create a new deal scenario

    Given user is already on Login Page https://www.freecrm.com/
    When title of login page is Free CRM
    Then user enters username and password
      | username | password |
      | swapnak | abc123 |
    Then user clicks on login button
    Then user is on home page
    Then user moves to new deal page
    Then Close the browser