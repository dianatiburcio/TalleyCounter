/**
 * 
 * @author diana tiburcio 
 * TalleyCounter 
 *
 */
public class TalleyCounter 
{
	//feilds
	private int count;
	
	//constructor 
	public TalleyCounter()
	{
		count = 0;
	}
	public TalleyCounter(int begin)
	{
		count = begin; 
	}
	
	//method
	public void click()
	{
		// count = count + 1
		// count += 1
		count++;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void unclick()
	{
		count --;
	}
	
	public void reset()
	{
		count = 0;
	}
}
