public class CarFactory
{
    public Car getCar(String carType)
    {
	if (carType == "Basic")
	    return new BasicCar();

	else if (carType == "Luxury")
	    return new LuxuryCar();

	else if (carType == "Sports")
	    return new SportsCar();

	else return null;
    }
}
