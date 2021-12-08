Feature: To validate the login functionality of fb appalication

  Scenario: To validate the valid username and invalid password
    Given To launch the edge browser and max window
    When To launch url of the Facebook application
    And To pass the vaild username in email field
    And To pass the invalid password in password field
    And To click the login button
    And To check whether navigate to the home page or not
    Then To close the browser

  Scenario Outline: To validate the login functionality of fb appalication
    Given To launch the edge browser and max window
    When To launch url of the Facebook application
    And User has To pass the data "<usernamedata>" in email field
    And User has To pass the data "<passworddata>" in password field
    And To check whether navigate to the home page or not
    Then To close the browser

    Examples: 
      | usernamedata    | passworddata |
      | mano@gmail.com  | smk143@nm    |
      | manoj@yahoo.com | smk143nmV    |
