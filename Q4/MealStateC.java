public class MealStateC implements State
{
    @Override
    public void createMeal(Context context)
    {
	System.out.println("A new meal will be created");

	Meal mealC = new DrinkDecorator(new FriesDecorator(new Burger()));
	
	mealC.displayItems();
	System.out.println("");
	System.out.println("Items: " + mealC.getItemCount());
	
	context.setState(this);
    }

    public String toString()
    {
	return "Meal State C";
    }			  
}
