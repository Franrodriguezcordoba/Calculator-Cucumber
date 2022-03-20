#Author: francisco.rodriguezcordoba@uma.es
Feature: Division

Scenario: Divide two numbers
Given The calculator is running
When I have entered 3.0 and 2.0 in the calculator to divide them
Then output of the division should be 1.5
