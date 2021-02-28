public class Car extends AbstractCar
{
    @Override
    public void setCharacteristics()
    {
	seats = "null";
	engine = "null";
    }

    @Override
    public void confirmCreation()
    {
	System.out.println("Car created with " + seats + " seats and " + engine + " engine.");
    }
}
