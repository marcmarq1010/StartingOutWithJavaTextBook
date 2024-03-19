
public class GenericMethodsTest
{
	
	public static void main(String[] args) 
	{ 
		
		// create arrays of Integer, Double and Character 
		Integer[] integerArray =  {1, 2, 3, 4, 5, 6}; 
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7}; 
		Character[] characterArray = {'H', 'E', 'L', 'L', 'O'}; 
		System.out.printf("Array integerArray contains: "); 
		printArray(integerArray); //pass an Integer array 
		System.out.printf("Array doubleArray contains: "); 
		printArray(doubleArray); //pass a Double array 
		System.out.printf("Array characterArray contains: "); 
		printArray(characterArray); // pass a Character array 
	
	} 
	
	public static <E> void printArray(E[] inputArray)
	{
		// display array elements 	
		for (E element : inputArray) 
		{
			System.out.print(" " + element); 	
		} 		
		
		System.out.printf("\n"); 	
	}

}
