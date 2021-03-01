public class Context
{
    private State state;

    public Context()
    {
	state = null;
    }

    public void setState(State thisState)
    {
	state = thisState;
    }

    public State getState()
    {
	return state;
    }
}
