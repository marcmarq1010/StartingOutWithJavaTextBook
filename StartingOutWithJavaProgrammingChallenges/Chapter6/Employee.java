
public class Employee
{
	private String name;			// Holds the employee’s name
	private String department;		// Holds the name of the department where the employee works
	private String position;		// Holds the employee’s job title
	private int idNumber;			// Holds the employee’s ID number
	
	public Employee(String name, int id, String dept, String pos)
	{
		setName(name);
		setIdNumber(id);
		setDepartment(dept);
		setPosition(pos);
	}
	
	public Employee(String name, int id)
	{
		setName(name);
		setIdNumber(id);
		setDepartment("");
		setPosition("");
	}
	
	public Employee()
	{
		setName("");
		setIdNumber(0);
		setDepartment("");
		setPosition("");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	public String getPosition()
	{
		return position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	public int getIdNumber()
	{
		return idNumber;
	}

	public void setIdNumber(int idNumber)
	{
		this.idNumber = idNumber;
	}
	
	
}

/*
Once you have written the class, write a separate program that creates three Employee objects to hold the following data:

Name			ID Number		Department			Position
Susan Meyers	47899			Accounting			Vice President
Mark Jones		39119			IT 					Programmer
Joy Rogers		81774			Manufacturing		Engineer
	
The program should store this data in the three objects and then display the data for each employee on the screen.
*/