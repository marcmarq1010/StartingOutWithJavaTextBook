
public class AreaTester
{

	public static void main(String[] args)
	{
		
		testMethod();
		
	}
	
	public static void testMethod()
	{		
		System.out.printf("The area of a circle with a radius of %d is: %.2f\n", 24, Area.getArea(24));
		
		System.out.printf("The area of a rectangle with a width of %d and length of %d is: %.2f\n", 24, 24, Area.getArea(24, 24));

		System.out.printf("The area of a cylinders with a radius of %d and a height of %d is: %.2f\n", 24, 24, Area.getArea(24, 24, 0));
	}

}
