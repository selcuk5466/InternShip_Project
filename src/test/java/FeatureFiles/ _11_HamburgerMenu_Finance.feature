Feature: _07_HamurgerMenu_Messaging

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Finance Functionality

And Click on the element Top Menu
| hamburgerMenu |

Then Hover Over the Finance button

And Click on the element in Dialog
| MyFinanceButton |
| viewButton      |

And Click the Stripe button to choose the payment method

And Click on the element in Dialog
| payAmountDue |
| payButton    |

And Enter the amount to be paid

And Click the Pay button

And User must enter card details

And The user should receive a confirmation message that they have paid