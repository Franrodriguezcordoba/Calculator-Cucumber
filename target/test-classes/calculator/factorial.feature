#Author: francisco.rodriguezcordoba@uma.es
Feature: Factorial

Scenario: The factorial of two numbers
Given The calculator is running
When I have entered 3 in the calculator to calculate his factorial
Then output of the factorial should be 6
