import javax.swing.JOptionPane;

/**
	This program creates three instances of the Rectangle class.
*/

public class RoomAreas
{

	public static void main(String[] args)
	{
		double number;			// To hold a number
		double totalArea;		// The total area
		String input;			// To hold user input


		// Create three Rectangle objects.
		RectanglePhase4 kitchen = new RectanglePhase4();
		RectanglePhase4 bedroom = new RectanglePhase4();
		RectanglePhase4 den = new RectanglePhase4();
		
		// Get and store the dimensions of the kitchen.
		input = JOptionPane.showInputDialog("What is the kitchen's length?");
		number = Double.parseDouble(input);
		kitchen.setLength(number);
		
		input = JOptionPane.showInputDialog("What is the kitchen's width?");
		number = Double.parseDouble(input);
		kitchen.setWidth(number);
		
		// Get and store the dimensions of the bedroom.
		input = JOptionPane.showInputDialog("What is the bedroom's length?");
		number = Double.parseDouble(input);
		bedroom.setLength(number);
		
		input = JOptionPane.showInputDialog("What is the bedroom's width?");
		number = Double.parseDouble(input);
		bedroom.setWidth(number);
		
		// Get and store the dimensions of the den.
		input = JOptionPane.showInputDialog("What is the den's length?");
		number = Double.parseDouble(input);
		den.setLength(number);
		
		input = JOptionPane.showInputDialog("What is the den's width?");
		number = Double.parseDouble(input);
		den.setWidth(number);
		
		// Calculate the total area of the rooms.
		totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
		
		// Display the total area of the rooms.
		JOptionPane.showMessageDialog(null, "The total area of the rooms is " + totalArea);
		
		System.exit(0);
		
	}
	
}