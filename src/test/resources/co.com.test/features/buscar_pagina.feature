#language: en

Feature: validate search in google

  Scenario Outline:
    Given The user is on the google
    When The user search the "<Page>"
    When The user books a flight
    Then Flight reservation is confirmed
    Examples:
      | Page    |
      | Avianca |
