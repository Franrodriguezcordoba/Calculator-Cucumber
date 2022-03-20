#Author: francisco.rodriguezcordoba@uma.es
Feature: Prime

Scenario: IsPrime?
Given The calculator is running
When I have entered <a> in the calculator to see if it is prime
Then output should be <result>

Examples: 
      | a | result    |
      | 7 | "true"    | 
      | 4 | "false"   |
