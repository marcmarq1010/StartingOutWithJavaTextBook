import java.util.Random;
import java.util.Scanner;

public class LargerThanN
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Random randy = new Random(5);
		
		int[] array = new int[100];
		int n;
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = randy.nextInt(0,1000);
		}
		
		System.out.printf("Enter an integer:\n");
		n = keyboard.nextInt();
		
		System.out.printf("All the numbers larger than %d:\n", n);
		displayLargerThanN(array, n);
		
		keyboard.close();
		
	}
	
	public static void displayLargerThanN(int [] array, int n)
	{
		for(int number : array)
		{
			if(number > n)
			{
				System.out.printf("%d\n", number);
				
			}
		}
	}

}

/*
In a program, write a method that accepts two arguments:
	an array and a number n.
Assume that the array contains integers.
The method should display all of the numbers in the array that are greater than the number n.
*/