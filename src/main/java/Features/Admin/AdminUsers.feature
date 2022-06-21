Feature: Admin Accounts


  Scenario Outline: Admin : Admin Account : Create Account

    Given user is already on Login Page "https://auth.qa.success4.us/"
    Then user enters "<username>" and "<password>"
    Then user clicks on login button1
    Then user clicks on Menu
    Then On click "Admin Portal"
    Then Switch the tab
    #Then On click "Accounts"
    Then On click Account
    Then On click New Account
    Then user enters account details "test2" and "N"
    Then On click Submit
    Then Close the browser


    Examples:
      | username            | password  |
      | support@success4.io | Admin@123 |


  Scenario Outline: Admin : Admin Account : Assign User To Account

    Given user is already on Login Page "https://auth.qa.success4.us/"
    Then user enters "<username>" and "<password>"
    Then user clicks on login button1
    Then user clicks on Menu
    Then On click "Admin Portal"
    Then Switch the tab
    Then On click Account
    Then On click table row "Bajaj"
    Then On click Assign Users
    Then Close the browser

    Examples:
      | username            | password  |
      | support@success4.io | Admin@123 |


  Scenario Outline: Admin : Admin Account : Assign Team To Account

    Given user is already on Login Page "https://auth.qa.success4.us/"
    Then user enters "<username>" and "<password>"
    Then user clicks on login button1
    Then user clicks on Menu
    Then On click "Admin Portal"
    Then Switch the tab
    Then On click Account
    Then On click table row "Bajaj"
    Then On click Assign Team
    Then Close the browser

    Examples:
      | username            | password  |
      | support@success4.io | Admin@123 |



