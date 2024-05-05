
public class LoShuMagicSquare
{
	private int[][] square = new int[3][3];
	
	public LoShuMagicSquare()
	{
		
	}
	
	public int sumOfRow(int row)
	{
		int total = 0;
		
		for(int i = 0; i < square[row].length; i++)
		{
			total += square[row][i];
		}
		
		return total;
	}
	
	public int sumOfCol(int col)
	{
		int total = 0;
		
		for(int i = 0; i < square.length; i++)
		{
			total += square[i][col];
		}
		
		return total;
	}
	
	public int sumOfDiagLeftToRightDown()
	{
		int total = 0;
		
		for(int i = 0; i < square.length; i++)
		{
			for(int j = i; j < i + 1; j++)
			{
				total += square[i][j];
			}
		}
		
		return total;
	}
	
	public int sumOfDiagLeftToRightUp()
	{
		int total = 0;
		
		for(int j = 0; j < square[0].length ; j++)
		{
	
		}
		
		return total;
	}
}

/*
The Lo Shu Magic Square is a grid with 3 rows and 3 columns, shown in Figure 7-31.
The Lo Shu Magic Square has the following properties:

• The grid contains the numbers 1 through 9 exactly.
• The sum of each row, each column, and each diagonal all add up to the same number.

This is shown in Figure 7-32.
In a program you can simulate a magic square using a two-dimensional array.
Write a method that accepts a two-dimensional array as an argument,
and determines whether the array is a Lo Shu Magic Square.
Test the function in a program.
*/