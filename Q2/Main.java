public class Main
{
    public static void main(String[] args)
    {
	CarFactory carFactory = new CarFactory();

	Car car1 = carFactory.getCar("Luxury");
	Car car2 = carFactory.getCar("Sports");

	car1.assembleCar();
	car2.assembleCar();

	car1.confirmAssembly();
	car2.confirmAssembly();
	
	return;
    }
}
