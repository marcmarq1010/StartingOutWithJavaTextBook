
public class Geometry
{
	public static double getAreaCircle(double radius)
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	public static double getAreaRectangle(double length, double width)
	{
		return length * width;
	}
	
	public static double getAreaTriangle(double base, double height)
	{
		return base * height * 0.5;
	}
	
	public static boolean isNegative(double value)
	{
		if(value <= 0)
		{
			System.out.printf("ERROR: Enter a value larger than zero.\n");
			return true;
		}
		else
			return false;
	}
}
