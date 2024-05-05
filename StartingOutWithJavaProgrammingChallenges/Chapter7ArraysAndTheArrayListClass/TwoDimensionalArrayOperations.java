
public class TwoDimensionalArrayOperations
{
	int[][] arrayInt;
	
	public TwoDimensionalArrayOperations(int[][] twoDimArray)
	{
		arrayInt = twoDimArray;
	}
	
	public int getTotal(int[][] twoDimArray)
	{
		int total = 0;
		
		for(int row = 0; row < twoDimArray.length; row++)
		{
			for(int col = 0; col < twoDimArray[row].length; col++)
			{
				total += twoDimArray[row][col];
			}
		}
		
		return total;
	}
	
	public int getAverage(int[][] twoDimArray)
	{
		return getTotal(twoDimArray) / twoDimArray.length;
	}
	
	public int getRowTotal(int[][] twoDimArray, int subscriptOfRow)
	{
		int total = 0;
		
		for(int col = 0; col < twoDimArray[subscriptOfRow].length; col++)
		{
			total += twoDimArray[subscriptOfRow][col];
		}
		return total;
	}
	
	public int getColumnTotal(int[][] twoDimArray, int subscriptOfCol)
	{
		int total = 0;
		
		for(int row = 0; row < twoDimArray.length; row++)
		{
			total +=  twoDimArray[row][subscriptOfCol];
		}
		
		return total;
	}
	
	public int getHighestInRow(int[][] twoDimArray, int subscriptOfRow)
	{
		int highest = twoDimArray[subscriptOfRow][0];
		
		for(int col = 0; col < twoDimArray[subscriptOfRow].length; col++)
		{
			if(highest < twoDimArray[subscriptOfRow][col])
				highest = twoDimArray[subscriptOfRow][col];
		}
		return highest;
	}
	
	public int getLowestInRow(int[][] twoDimArray, int subscriptOfRow)
	{
		int lowest = twoDimArray[subscriptOfRow][0];
		
		for(int col = 0; col < twoDimArray[subscriptOfRow].length; col++)
		{
			if(lowest > twoDimArray[subscriptOfRow][col])
				lowest = twoDimArray[subscriptOfRow][col];
		}
		return lowest;
	}
	
}
