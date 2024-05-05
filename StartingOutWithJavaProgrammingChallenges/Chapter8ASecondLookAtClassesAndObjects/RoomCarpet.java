
public class RoomCarpet
{
	private RoomDimension size;
	double carpetCost;
	
	public RoomCarpet()
	{
		
	}
	
	public RoomCarpet(RoomDimension size)
	{
		this.size = new RoomDimension(size);
	}
	
	public RoomCarpet(double carpetCost)
	{
		setcarpetCost(carpetCost);
	}
	
	public RoomCarpet(RoomDimension size, double carpetCost)
	{
		this.size = new RoomDimension(size);
		setcarpetCost(carpetCost);
	}
	
	@Override
	public String toString()
	{
		return String.format("%.2f", getTotalcarpetCost());
	}

	public double getTotalcarpetCost()
	{
		return size.area() * getcarpetCost();
	}

	public double getcarpetCost()
	{
		return carpetCost;
	}

	public void setcarpetCost(double carpetCost)
	{
		this.carpetCost = carpetCost;
	}
	
	
}
