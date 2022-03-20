#Author: francisco.rodriguezcordoba@uma.es
Feature: Subtraction

Scenario: Subtraction two numbers
Given The calculator is running
When I have entered <a> and <b> in the calculator to subtraction them
Then output of the subtraction should be <result>

    Examples: 
      | a   | b   | result  |
      | 2.0 | 1.0 | 1.0     |
      | 10.2| 8.2 | 2.0     |
