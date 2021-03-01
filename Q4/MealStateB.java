public class MealStateB implements State
{
    @Override
    public void createMeal(Context context)
    {
	System.out.println("A new meal will be created");

	Meal mealB = new FriesDecorator(new Burger());
	
	mealB.displayItems();
	System.out.println("");
	System.out.println("Items: " + mealB.getItemCount());
	
	context.setState(this);
    }

    public String toString()
    {
	return "Meal State B";
    }			  
}
