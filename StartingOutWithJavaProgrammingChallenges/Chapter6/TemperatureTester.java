import java.util.Scanner;

public class TemperatureTester
{

	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		Temperature temp = new Temperature();
		
		System.out.printf("Enter the temperature in Fahrenheit:\n");
		temp.setFahrenheit(keyboard.nextDouble());
		
		System.out.printf("The temperature in Fahrenheit: %.2f\n", temp.getFahrenheit());
		
		System.out.printf("The temperature in Celcius: %.2f\n", temp.getCelsius());

		System.out.printf("The temperature in Kelvin: %.2f\n", temp.getKelvin());

		keyboard.close();
	}
	
}

/*	
Demonstrate the Temperature class by writing a separate program that asks the user for a Fahrenheit temperature.
The program should create an instance of the Temperature class,
with the value entered by the user passed to the constructor.
The program should then call the object’s methods to display the temperature in Celsius and Kelvin.abstract
*/