public class SportsDecorator extends Decorator
{
    public SportsDecorator(AbstractCar thisCar)
    {
	car = thisCar;
    }
    
    @Override
    public void setCharacteristics()
    {
	car.seats = "bucket";
	car.engine = "fuel-injected";
    }
}
