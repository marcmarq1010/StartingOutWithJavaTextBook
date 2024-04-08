
public class EmployeeTester
{

	public static void main(String[] args)
	{
		
		Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
		Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
		
		System.out.printf("%-15s %-15s %-15s %-15s\n", "Name", "ID Number", "Department", "Position");

		System.out.printf("%-15s %-15d %-15s %-15s\n", emp1.getName(), emp1.getIdNumber(), emp1.getDepartment(), emp1.getPosition());
	
		System.out.printf("%-15s %-15d %-15s %-15s\n", emp2.getName(), emp2.getIdNumber(), emp2.getDepartment(), emp2.getPosition());

		System.out.printf("%-15s %-15d %-15s %-15s\n", emp3.getName(), emp3.getIdNumber(), emp3.getDepartment(), emp3.getPosition());

	}

}
