public class Main
{
    public static void main(String[] args)
    {
	Context context = new Context();

	MealStateA stateA = new MealStateA();
	stateA.createMeal(context);
	System.out.println(context.getState().toString());

	MealStateB stateB = new MealStateB();
	stateB.createMeal(context);
	System.out.println(context.getState().toString());

	MealStateC stateC = new MealStateC();
	stateC.createMeal(context);
	System.out.println(context.getState().toString());
    }
}
