public class DrinkDecorator extends Decorator
{
    public DrinkDecorator(Meal thisMeal)
    {
	meal = thisMeal;
    }

    @Override
    public void displayItems()
    {
	meal.displayItems();
	System.out.print(" + Drink");
    }

    @Override
    public int getItemCount()
    {
	return meal.getItemCount() + 1;
    }
}
