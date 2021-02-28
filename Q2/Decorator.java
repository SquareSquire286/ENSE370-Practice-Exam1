public abstract class Decorator extends Car
{
    AbstractCar car;
    
    @Override
    public void setCharacteristics()
    {
	car.seats = "concrete";
	car.engine = "concrete";
    }

    @Override
    public void confirmCreation()
    {
	System.out.println("Car created with " + car.seats + " seats and " + car.engine + " engine.");
    }
}
