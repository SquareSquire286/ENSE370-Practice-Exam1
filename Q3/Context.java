public class Context
{
    Strategy strategy;

    public Context(Strategy thisStrategy)
    {
	strategy = thisStrategy;
    }

    public void doStrategy()
    {
	strategy.doAction();
    }
}
