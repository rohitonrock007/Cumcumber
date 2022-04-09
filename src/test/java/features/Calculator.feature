Feature: This feature would be creating a caculator for Add and Substract

  Scenario: To Add two numbers
    Given I have a Calcultor
    When I add 4 & 5
    Then I should be get the result as 9

  Scenario: To Substract two numbers
    Given I have a Calcultor
    When I sub 16 & 10
    Then I should be get the result as 6

  Scenario Outline: To Add two numbers using scenario outline
    Given I have a Calcultor
    When I add <num1> & <num2>
    Then I should be get the result as <result>

    Examples: 
      | num1 | num2 | result |
      |    4 |    7 |     11 |
      |    3 |    5 |      8 |

  Scenario Outline: To Add two numbers using scenario outline
    Given I have a Calcultor
    When I add <num1> , <num2> & <num3>
    Then I should be get the result as <result>

    Examples: 
      | num1 | num2 | num3 | result |
      |    4 |    7 |   10 |     21 |
      |    3 |    5 |   10 |     18 |

  Scenario: Add multiple numbers using cucumber data table
    Given I have a Calcultor
    When I add below numbers
      |  4 |
      | 10 |
      | 10 |
      | 10 |
      |  6 |
    Then I should be get the result as 40

  Scenario: Add multiple numbers using cucumber data table
    Given I have a Calcultor
    When I add below numbers using List
      |  4 |
      | 10 |
      | 10 |
      | 10 |
      |  6 |
      | 10 |
    Then I should be get the result as 50

  Scenario: To Calcualtor the total bill of the order
    Given I have a Calcultor
    When I order below Items
      | Coffee    | 20 |
      | tea       | 25 |
      | Colddrink | 30 |
    Then I should be get the result as 75

  Scenario: To Calcualtor the total bill of the order using quantity
    Given I have a Calcultor
    When I order below Items and quantity
      | Coffee    | 1 | 10 |
      | tea       | 2 | 20 |
      | Colddrink | 3 | 30 |
    Then I should be get the result as 140
