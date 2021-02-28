# Question 4C

**PROMPT**: Assume that there is a class called Burger which can represent different burgers such as single cheeseburger, double cheeseburger, triple cheeseburger, etc. The class is implemented in the following way:
~~~~
public class Burger {
  private float pattyCost; // cost of one beef patty
  private float otherCost; // cost of other components such as buns, toppings, etc
  
  public float getSingleCheeseburgerCost() {
    return pattyCost + otherCost;
  }
  
  public float getDoubleCheeseburgerCost() {
    return pattyCost * 2 + otherCost;
  }
  
  public float getTripleCheeseburgerCost() {
    return pattyCost * 3 + otherCost;
  }
  
  // other class methods
  ...
}
~~~~
Explain what is undesirable about this code and refactor it to make it better.

# Response
The above code for the Burger class is undesirable because there is duplication of a nearly identical operation (calculating cost) in multiple methods. The implementation in this example requires a method to exist for each number of beef patties that can be added to a hamburger. For example, if a user is free to include up to seven patties on their hamburger, then seven different methods would be necessary. This adds unnecessary lines of code to the class, which decreases readability. Additionally, this design increases complexity, as if the Burger class is asked to calculate a cost, then a series of conditional expressions would be necessary in order to determine which cost calculation method must be called. A preferable implementation would be to refactor the cost calculation such that it accepts an integer input for the user-specified number of patties, and returns a cost based on this input. As a result of this refactored design, only one method would be necessary, and the Burger class would simply need to call this one method at all times when asked to calculate a cost. The new implementation is displayed below:

~~~~
public class Burger {
  private float pattyCost; // cost of one beef patty
  private float otherCost; // cost of other components such as buns, toppings, etc

  public float getCheeseburgerCost(int pattyCount) {
    return pattyCost * pattyCount + otherCost;
  }
}
~~~~
