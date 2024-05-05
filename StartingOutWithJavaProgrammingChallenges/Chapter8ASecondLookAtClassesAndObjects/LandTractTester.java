
public class LandTractTester
{
	
	public static void main(String[] args)
	{
		testMethod();
	}
	
	public static void testMethod()
	{		
		LandTract land1 = new LandTract(12, 12);
		
		LandTract land2 = new LandTract(11, 11);
		
		System.out.printf("The length of the first tract of land is %d.\n", 12);
		
		System.out.printf("The width of the first tract of land is %d.\n", 12);
		
		System.out.printf("The length of the second tract of land is %d.\n", 11);

		System.out.printf("The width of the second tract of land is %d.\n", 11);
		
		System.out.printf("The area of the first tract of land is %.2f.\n", land1.area());
		
		System.out.printf("The area of the second tract of land is %.2f.\n", land2.area());
		
		if(land1.equals(land2))
			System.out.printf("The tracts of land are equal.\n");
		else
			System.out.printf("The tracts of land are not equal.\n");
	}

}
