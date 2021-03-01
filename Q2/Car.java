public abstract class Car
{
    public String seats;
    public String engine;

    public void assembleCar()
    {
	seats = "null";
	engine = "null";
    }

    public void confirmAssembly()
    {
	System.out.println("Car created with " + seats + " seats and " + engine + " engine.");
    }
}
