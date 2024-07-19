Feature: Search and Place the order for Products
@OffersPage
Scenario Outline: Search Experience for product search in both home and Offers page

Given User is on GreenCart Landing page
When user searched with Shortname "Tom" and extracted actual name of product
Then user searched for "Tom" shortname in offers page


Examples:
| Name  |
| Tom 	|


