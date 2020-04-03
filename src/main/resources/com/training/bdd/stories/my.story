Scenario:
    As a user,
    I want to be able remove some dishes,
    in which case,
    a new coefficient is calculated using the left dishes.

Given I used an array '<list>' of dishes
When I remove the dishes '<listRemoved>'
Then the output must be '<result>'
Examples:
| list               | listRemoved | result |
| [-1, -9, 0, 5, -7] | [-9, -7]    | 14     |