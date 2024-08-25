#Author: your.email@your.domain.com

Feature: Title of your feature
  I want to use this template for my feature file
  
  Background: 
	Given launch the browser
	Then open the url
  
  @HookTest @RegressionTest
  Scenario Outline: Login into an application
    Given I want to write a step with precondition
    When User login into the application using username "<Username>" and password "<Password>"

    Examples: 
      | Username   | Password  |
      | debituser  | debit123  |
      | creditUser | credit123 |
      
  @Demo @RegressionTest
  Scenario: user is on login page
    Given user is on login page
    Then user enters his credentials
      | nilay                 |
      | nilaybogota@gmail.com |
      |            3105873130 |