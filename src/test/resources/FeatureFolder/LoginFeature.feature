Feature: Testing the login functionality of swaglabs

  Scenario Outline: Verify the login is working with valid credentials
    Given Launch the web browser
    When Navigate to swaglabs home page
    And Enter valid <username> and <password>
    Then Click login button
    And I will verify user is navigated to swaglabs home page
    And Close the web browser

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
