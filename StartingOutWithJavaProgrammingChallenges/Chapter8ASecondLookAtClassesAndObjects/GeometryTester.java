import java.util.Scanner;

public class GeometryTester
{

	public static void main(String[] args)
	{
		loopMenu();
		
	}
	
	public static void loopMenu()
	{
		int choice;
		
		do{
			displayMenu();
			
			choice = getMenuChoice();
			
			switch(choice)
			{
				case 1:
					enterValuesForCircle();
					break;
				case 2:
					enterValuesForRectangle();
					break;
				case 3:
					enterValuesForTriangle();
					break;
				case 4:
					displayQuitMenuMessage();
					break;
				default:
					displayMenuErrorMessage();
					break;
			}
			
		}while(choice != 4);
	}
	
	public static void displayMenu()
	{
		System.out.printf("Geometry Calculator\n");
		System.out.printf("1. Calculate the Area of a Circle\n");
		System.out.printf("2. Calculate the Area of a Rectangle\n");
		System.out.printf("3. Calculate the Area of a Triangle\n");
		System.out.printf("4. Quit\n");
		System.out.printf("Enter your choice (1-4):\n");
	}
	
	public static void displayMenuErrorMessage()
	{
		System.out.printf("ERROR: Do not enter a number outside the range of 1 through 4 "
						 +"when selecting an item from the menu.\n\n");
	}
	
	public static void displayQuitMenuMessage()
	{
		System.out.printf("Closing the program.\nGoodbye.\n");
	}
	
	public static int getMenuChoice()
	{
		Scanner keyboard = new Scanner(System.in);
		
		int choice = keyboard.nextInt();
				
		return choice;
	}
	
	public static void enterValuesForCircle()
	{
		double radius;
		
		System.out.printf("Enter the radius of the circle.\n");
		radius = EnterValues();
		
		System.out.printf("The area of the circle is %.2f\n\n", Geometry.getAreaCircle(radius));
	}
	
	public static void enterValuesForRectangle()
	{
		double length, width;
		
		System.out.printf("Enter the length of the rectangle.\n");
		length = EnterValues();
		
		System.out.printf("Enter the width of the rectangle.\n");
		width = EnterValues();
		
		System.out.printf("The area of the rectangle is %.2f\n\n", Geometry.getAreaRectangle(length, width));
		
	}
	
	public static void enterValuesForTriangle()
	{
		double base, height;
		
		System.out.printf("Enter the base of the triangle.\n");
		base = EnterValues();
		
		System.out.printf("Enter the height of the triangle.\n");
		height = EnterValues();
		
		System.out.printf("The area of the triangle is %.2f\n\n", Geometry.getAreaTriangle(base, height));

	}
	
	public static double EnterValues()
	{
		Scanner keyboard = new Scanner(System.in);
		
		double value;
		
		do{
			
			value = keyboard.nextDouble();
				
		}while(Geometry.isNegative(value));
			
		return value;
	}
	





}

/*
Display an error message if the user enters a number outside the range of 1 through 4
	when selecting an item from the menu.
*/