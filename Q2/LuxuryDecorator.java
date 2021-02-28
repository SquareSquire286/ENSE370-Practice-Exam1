public class LuxuryDecorator extends Decorator
{
    public LuxuryDecorator(AbstractCar thisCar)
    {
	car = thisCar;
    }
    
    @Override
    public void setCharacteristics()
    {
	car.seats = "leather";
	car.engine = "larger";
    }
}
