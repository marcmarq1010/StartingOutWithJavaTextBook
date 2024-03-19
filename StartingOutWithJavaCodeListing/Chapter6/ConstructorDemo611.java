/**
	This program demonstrates the Rectangle class's constructor.
*/

public class ConstructorDemo611
{
	public static void main(String[] args) 
	{
		
		// Create a Rectangle object, passing 5.0 and
		// 15.0 as arguments to the constructor.
		Rectangle610 box = new Rectangle610(5.0, 15.0);
		
		// Display the length.
		System.out.println("The box's length is " + box.getLength());
		
		// Display the width.
		System.out.println("The box's width is " + box.getWidth());
		
		// Display the area.
		System.out.println("The box's area is " + box.getArea());

	}
	
}
