#Feature:-collections of scenarios
#To run a scenario we need a test runner that can be either TestNG or Junit
@tag
Feature: Title of your feature
  I want to use this template for my feature file

Background: 
	Given launch the browser
	Then open the url

  @SmokeTest @RegressionTest
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    When User login into the application using username admin and password "1234"
    And some other precondition
    When I complete action
    Then I validate the outcomes
    
  @RegressionTest
  Scenario Outline: Login into an application
    Given I want to write a step with precondition
    When User login into the application using username "<Username>" and password "<Password>"

    Examples: 
      | Username   | Password  |
      | debituser  | debit123  |
      | creditUser | credit123 |
      
  @Demo
  Scenario: user is on login page
    Given user is on login page
    Then user enters his credentials
      | nilay                 |
      | nilaybogota@gmail.com |
      |            3105873130 |
