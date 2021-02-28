public class Main
{
    public static void main(String[] args)
    {
	Context tourist = new Context(new ByBus());
	tourist.doStrategy();

	return;
    }
}
