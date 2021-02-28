public class Main
{
    public static void main(String[] args)
    {
	AbstractCar luxuryCar = new LuxuryDecorator(new Car());
	AbstractCar sportsCar = new SportsDecorator(new Car());

	luxuryCar.setCharacteristics();
	sportsCar.setCharacteristics();
	
	luxuryCar.confirmCreation();
	sportsCar.confirmCreation();

	return;
    }
}
