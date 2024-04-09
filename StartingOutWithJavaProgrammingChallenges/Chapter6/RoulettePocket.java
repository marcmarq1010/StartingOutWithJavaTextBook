
public class RoulettePocket
{
	
	public RoulettePocket()
	{
		
	}
	
	public RoulettePocket(int pocketNumber)
	{
		getPocketColor(pocketNumber);
	}
	
	public String getPocketColor(int pocketNumber)
	{
		if(pocketNumber == 0)
		{
			return "green";
		}
		else if(pocketNumber >= 1 && pocketNumber <= 10)
		{
			if(pocketNumber % 2 == 0)
				return "black";
			
			return "red";
		}
		else if(pocketNumber >= 11 && pocketNumber <= 18)
		{
			if(pocketNumber % 2 == 0)
				return "red";
			
			return "black";
		}
		else if(pocketNumber >= 19 && pocketNumber <= 28)
		{
			if(pocketNumber % 2 == 0)
				return "black";
			
			return "red";
		}
		else if(pocketNumber >= 29 && pocketNumber <= 36)
		{
			if(pocketNumber % 2 == 0)
				return "red";
			
			return "black";
		}
		else
		{
			return "out of bounds";
		}
	}
	
}
