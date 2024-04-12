import java.util.Scanner;

public class CircleTester
{
	
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		Circle circle = new Circle();
		
		System.out.printf("Enter the radius of a circle:\n");
		circle.setRadius(keyboard.nextDouble());
		
		System.out.printf("The circle's area is : %,.2f\n", circle.getArea());
	
		System.out.printf("The circle's diameter is : %,.2f\n", circle.getDiameter());

		System.out.printf("The circle's circumference is : %,.2f\n", circle.getCircumference());
		
		keyboard.close();

	}
	
}
