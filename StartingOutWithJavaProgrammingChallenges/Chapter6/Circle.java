
public class Circle
{
	private double radius;
	private final double PI = 3.14159;
	
	public Circle()
	{
		setRadius(0.0);
	}
	
	public Circle(double radius)
	{
		setRadius(radius);
	}
	
	public double getArea()
	{
		return PI * Math.pow(radius, 2);
	}
	
	public double getDiameter()
	{
		return radius * 2;
	}
	
	public double getCircumference()
	{
		return 2 * PI * radius;
	}

	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(double radius) 
	{
		this.radius = radius;
	}

	public double getPI() 
	{
		return PI;
	}
	
	
}
