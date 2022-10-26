#Author: arshan.memon@bofa.com
#Date: Oct 22nd, 2022
#Keywords Summary : Validating 'Encounter Date' field error for prod incident DTE603 
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Encounter Date Field
#  I want to use this test case for my feature file

  @tag1
  Scenario: Enter today date in Encounter Date field
    Given user is in login page
    And user has access to credentials
    When user enter username
    And user enter password
    And user click login button
    Then user is able to access tmds 
    And user able to log out from tmds


