# Make Change

### Overview

Have you ever worked in retail or the service industry? Have you ever been a Cashier? Make Change is a Cash Register that instructs a Cashier on how to make change. No more quick math on those busy days, Make Change will do it all for you.

### How To Use

When a Customer purchases an item, the Cashier will be prompted to enter the price of the item. The Cashier will then also enter the amount of money the Customer uses to purchase the item. Make Change does all the math for the Cashier and explains which USD bills and coins need to be dispensed back to the Customer in order to - Make Change.

### Building Make Change

I started building Make Change with the initial prompts to the customer and the input of the Item Price and the Customer's Payment. Using 'if' statements, I created the outline of how to determine if the Customer's Payment was less than the price - which results in an error, if the Payment was equal to the price - which results in needing no change, or if the Payment was more than the price - resulting in the Customer needing change.

Secondly, I built the 'while loops' to determine if change was needed for each specific denomination ($20, $10, $5, %1, $.25, $.10, $.05, $.01).

Problem: At first I wasn't sure how to clean up the grammar between single and plural instances when saying "One Dollar Bill" - "Two Dollar Bill" or "One Dollar Bills" = "Two Dollar Bills".

Solution: I changed the output to reflect x $20, or x $10, etc.

Problem: I did not like how it showed zeroes for the denominations that weren't used. I wanted to only display the denominations that would be dispensed to the Customer. I attempted to use a Boolean and Switch/Case to only print lines that had data to output. I attempted to create a second Method and move everything in my third 'If Statement' - all the While Loops - into their own method and use a Boolean to only print when values appeared in each loop. I was unsuccessful.

Solution: At this time I was unable to make it work and will hopefully learn eventually how to complete that.
