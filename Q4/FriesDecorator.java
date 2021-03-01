public class FriesDecorator extends Decorator
{
    public FriesDecorator(Meal thisMeal)
    {
	meal = thisMeal;
    }

    @Override
    public void displayItems()
    {
	meal.displayItems();
	System.out.print(" + Fries");
    }

    @Override
    public int getItemCount()
    {
	return meal.getItemCount() + 1;
    }
}
