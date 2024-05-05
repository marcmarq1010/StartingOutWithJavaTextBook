
/**
	A class that has three overloaded static methods
	for calculating the areas of the following geometric shapes:

		• circles
		• rectangles
		• cylinders
 */
public class Area
{
	/**
		The three methods are overloaded,
		they  each have the same name,
		but different parameter lists.
	 	@return area
	*/
	
	public static double getArea(double radius)
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	public static double getArea(double width, double length)
	{
		return width * length;
	}
	
	public static double getArea(double radius, double height, int exponent)
	{
		return Math.PI * Math.pow(radius, 2) * height;
	}

}
