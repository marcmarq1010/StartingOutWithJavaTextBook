
public class CarpetCalculator
{

	public static void main(String[] args)
	{
		testMethod();
	}
	
	public static void testMethod()
	{		
		RoomDimension room = new RoomDimension(12, 12);
		
		RoomCarpet carpet = new RoomCarpet(room, 10);
		
		System.out.printf("The width of the carpet is %d.\n", 12);
		
		System.out.printf("The length of the carpet is %d.\n", 12);
		
		System.out.printf("The area of the carpet is %.2f.\n", room.area());
		
		System.out.printf("The price of the carpet per square feet is $%d.\n", 10);
		
		System.out.printf("The total price of the carpet for the room is $%.2f\n", carpet.getTotalcarpetCost());
	}

}
