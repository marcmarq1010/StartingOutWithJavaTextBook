
public class LandTract
{
	private double length;
	private double width;
	
	public LandTract()
	{
		
	}
	
	public LandTract(double length, double width)
	{
		setLength(length);
		setWidth(width);
	}

	
	public double area()
	{
		return getWidth() * getLength();
	}
	
	public boolean equals(LandTract landTract)
	{
		if(getLength() == landTract.getLength() && getWidth() == landTract.getWidth())
			return true;
		else
			return false;
	}

	@Override
	public String toString()
	{
		return "LandTract []";
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}
	
}
