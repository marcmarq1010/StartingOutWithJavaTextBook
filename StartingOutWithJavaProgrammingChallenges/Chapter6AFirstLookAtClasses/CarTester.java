
public class CarTester
{
	
	public static void main(String[] args)
	{
		
		Car car1 = new Car(1967, "Mustang");
		
		System.out.println("The car is accelerating.");
		
		for(int i = 0; i < 5; i++)
		{
			car1.accelerate();
			System.out.printf("Speed: %d mph\n", car1.getSpeed());
		}
		
		System.out.println("The car is braking.");
		
		for(int i = 0; i < 5; i++)
		{
			car1.brake();
			System.out.printf("Speed: %d mph\n", car1.getSpeed());
		}
		
	}
	
}
