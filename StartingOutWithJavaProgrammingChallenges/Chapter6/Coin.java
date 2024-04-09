import java.util.Random;

public class Coin
{
	private String sideUp;
	
	public Coin()
	{
		toss();
	}
	
	public void toss()
	{
		Random randomToss = new Random();
		
		int side = randomToss.nextInt(1,3);
		
		if(side == 1)
		{
			sideUp = "heads";
		}
		else
		{
			sideUp = "tails";
		}
	}
	
	public String getSideUp()
	{
		return sideUp;
	}
}
