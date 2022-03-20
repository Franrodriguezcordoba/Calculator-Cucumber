#Author: francisco.rodriguezcordoba@uma.es
Feature: Multiply

Scenario: Multiply two numbers
Given The calculator is running
When I have entered 5.0 * 5.0 in the calculator to multiply them
Then output of the multiplication should be 25.0
