Feature: To validate the login functionality of flip appalication

  Background: Same lines
    Given To launch the firfox browser and max window
    When To launch url of the Flipkart application

  Scenario: To validate the valid phonenumber and invalid password
    And To pass the vaild phonenumber in phno field
      | phonenumber1 | msappati@gmail.com   |
      | phonenumber2 | msappati@outlook.com |
      | phonenumber3 |           9347897286 |
    And To pass the invalid pswd in pswd field
      | pswd        | pswd2     | pswd3       |
      | smk143@nm   | smk143@nM | smk143@nmV  |
      | 986@jdbscjs | kjdbckjda | dbnckjajx   |
      | abcjbca     | djbckjd   | dkjbcsd bxn |
    And To click the lgn button
    And To check whether navigates to the home page or not
    Then To quite the browser

  Scenario: To validate the valid phonenumber and invalid password
    And To pass the vaild phone in phno field
    And To pass the invalid passwd in pswd field
    And To click the lgn button
    And To check whether navigates to the home page or not
    Then To quite the browser
