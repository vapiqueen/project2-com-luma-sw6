@regression
Feature: Women page functionality
  As a user I want to check women page functionality

  Background: I am on homepage
    And I mouse hover on Women Menu and mouse Hover on Tops and I click on Jackets

  @smoke
  Scenario: Verify the sort by ProductName filter
    And  I select sort By filter “Product Name” and I verify the products name display in alphabetical order

  @sanity
  Scenario: Verify the sortBy price filter
    And I select Sort By filter “Price” and verify the products price display in Low to High