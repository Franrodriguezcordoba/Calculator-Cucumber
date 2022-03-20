#Author: francisco.rodriguezcordoba@uma.es
Feature: Sum

Scenario: Sum two numbers
Given The calculator is running
When I have entered 4.0 and 3.0 in the calculator to sum them
Then output of the sum should be 7.0
