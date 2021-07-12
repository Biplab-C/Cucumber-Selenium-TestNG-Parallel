@feature
Feature: Validating the navigation in http://automationpractice.com/

@Tag1
Scenario Outline: Sorting the price in home pages

Given The URL is launched
Then Search the "<item>"
Then Verify the prices are sorted

	Examples:
	|item|
	|Shirt|

 