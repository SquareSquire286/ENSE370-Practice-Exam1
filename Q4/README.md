# ENSE 370 Winter 2019 Midterm Exam - Question 4

**PROMPT:** Consider an advanced version of a fast-food ordering system where the fast-food operator can create a number of set meals, where each set meal is a combination of various items such as burgers, fries, drinks, etc.. For example, the operator can create the following set meals:
1. Set A - burger only
2. Set B - burger + fries,
3. Set C - burger + fries + drink,
4. etc.

You may assume that there is a finite number of distinct combinations.

PART A: Design a system where a customer is asked to select one of the available existing set meals from the menu (i.e. A, B, C, etc,) and the appropriate items in the set meal will be prepared for him/her. Each selection can be considered as a 'state' of the system and the action needed to prepare the action meal will depend on this 'state.' Your design should allow the operator to easily create new set meals for the menu (e.g. Set D = burger + drink, etc.). Once a particular set meal is selected, the actual meal should be easily created from the items (i.e. burger, fries, drinks, etc.). You may assume that the item 'burger' is always a required item in a set meal and all other items (i.e. fries, drink, etc.) are add-ons in the set meals. State what Design Pattern(s) you have used and draw the Class diagram.

PART B: Assume that all the classes in your design in Q4(a) above had been implemented. Write the Java code for the `main()` method that creates one instance of the object that represents the set meal of your choice (i.e. can be A, B or C) and then use the appropriate class in your design pattern to call the appropriate class method(s) to create the actual set meal required. You may assume that this class method (or methods) is overridden correctly to do the action you require. Please provide comments to explain any other assumptions you have made. You may give your public class any name that you like.
