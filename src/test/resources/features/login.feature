#Feature: Login
#  As a User
#  I should be able to sign up/login
#  to use specific services

Feature: User login
  As a user
  I want to be able to sign up
  and login to the bbc site

  Scenario: If I use incorrect credentials when logging in I receive an error
    Given I am able to access the sign in page
    When I use incorrect credentials to login
    Then  I receive a viable error

  @test
  Scenario Outline: If I input incorrect password details I will receive the correct error message
    Given I am on the sign in page
    When I input a valid Email Address
    And I input an invalid <password> that will generate an error
    Then I receive the corresponding error <error>

    Examples:
      | password |                          error                                                 |
      | a@34567  |  Sorry, that password is too short. It needs to be eight characters or more.   |
      | abcd1234 |    Sorry, that password isn't valid. Make sure it's hard to guess.             |
      | abcdefgh | Sorry, that password isn't valid. Please include something that isn't a letter.|
      | 12345678 | Sorry, that password isn't valid. Please include a letter.                     |
