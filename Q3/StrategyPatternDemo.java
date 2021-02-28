public class StrategyPatternDemo
{
    public static void main(String[] args)
    {
	Context tourist = new Context(new ByBus());
	tourist.doStrategy();

	return;
    }
}
