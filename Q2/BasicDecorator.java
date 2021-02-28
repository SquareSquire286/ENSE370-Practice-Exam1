public class BasicDecorator extends Decorator
{
    public BasicDecorator(AbstractCar thisCar)
    {
	car = thisCar;
    }
    
    @Override
    public void setCharacteristics()
    {
	car.seats = "basic";
	car.engine = "basic";
    }
}
