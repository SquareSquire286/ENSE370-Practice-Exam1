public class MealStateA implements State
{
    @Override
    public void createMeal(Context context)
    {
	System.out.println("A new meal will be created");

	Meal mealA = new Burger();

	mealA.displayItems();
	System.out.println("");
	System.out.println("Items: " + mealA.getItemCount());
	
	context.setState(this);
    }

    public String toString()
    {
	return "Meal State A";
    }			  
}
