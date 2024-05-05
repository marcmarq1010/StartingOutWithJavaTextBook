
public class RoomDimension
{
	private double length;
	private double width;
	
	public RoomDimension()
	{
		
	}
	
	public RoomDimension(double length, double width)
	{
		setLength(length);
		setWidth(width);
	}
	
	public RoomDimension(RoomDimension roomDim)
	{
		this.length  = roomDim.getLength();
		this.width = roomDim.getWidth();	
	}

	public double area()
	{
		return length * width;
	}
	
	public boolean equals(RoomDimension roomDim2)
	{		
		// Determine whether this object's length and
		// width fields are equal to roomDim2's
		// length and width fields.
		if (length == roomDim2.length && width == roomDim2.width)
			return true; // Yes, the objects are equal.
		else
			return false; // No, the objects are not equal.
	}
	
	public RoomDimension copy()
	{
		// Create a new Stock object and initialize it
		// with the same data held by the calling object.
		RoomDimension copyRoomDim = new RoomDimension(length, width);
		
		// Return a reference to the new object.
		return copyRoomDim;
	}
	
	

	@Override
	public String toString()
	{
		return String.format("%.2f", area());
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
