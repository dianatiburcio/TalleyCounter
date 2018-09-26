/**
 * 
 * @author diana tiburcio
 *TallyCounter
 */
public class TallyMain 
{
	public static void main(String[] args)
	{
		TalleyCounter counter1 = new TalleyCounter();
		counter1.click();
		counter1.click();
		counter1.click();
		counter1.click();
		System.out.println("counter one has " + counter1.getCount() + " tallies");
		counter1.reset();
		TalleyCounter counter2 = new TalleyCounter(583);
		counter2.click();
		counter2.click();
		counter2.unclick();
		counter2.click();
		counter2.click();
		counter2.click();
		counter2.unclick();
		counter2.click();
		System.out.println("counter two has " + counter2.getCount() + " tallies");
		counter2.reset();
		System.out.print("counter two has " + counter2.getCount() + " tallies");
	}
}
