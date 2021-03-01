public class Burger extends Meal
{
    @Override
    public void displayItems()
    {
	System.out.print("Burger");
    }

    @Override
    public int getItemCount()
    {
	return 1;
    }
}
