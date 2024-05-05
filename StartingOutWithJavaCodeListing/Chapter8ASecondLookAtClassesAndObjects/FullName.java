/**
	This class stores a person's first, last, and middle
	names. The class is dangerous because it does not
	prevent operations on null reference fields.
*/

/**
	This program will crash when you run it because
	the getLength method is called before the
	name object’s fields are made to reference String objects
 */

public class FullName
{

	private String lastName;		// Last name 
	private String firstName;		// First name 
	private String middleName;		// Middle name

	/**
		Another way to handle this problem is to write a no-arg constructor
		that assigns values to the reference fields.
		Here is an example:
	 */
	
	public FullName()
	{
		lastName = "";
		firstName = "";
		middleName = "";	
	}
	
	/**
		The setLastName method sets the lastName field.
		@param str The String to set lastName to.
	*/
	
	public void setLastName(String str)
	{
		lastName = str;
	}
	
	/**
	The setFirstName method sets the firstName field.
	@param str The String to set firstName to.
	*/
	
	public void setFirstName(String str)
	{
		firstName = str;
	}
	
	/**
	The setMiddleName method sets the middleName field.
	@param str The String to set middleName to.
	*/
	
	public void setMiddleName(String str)
	{
		middleName = str;
	}
	
	/**
		The getLength method returns the length of the full name.
		@return The length.
	*/
	
	public int getLength()
	{
		return lastName.length() + firstName.length() + middleName.length();
	}
	
	/**
		One way to prevent the program from crashing is
		to use if statements in the getLength method to
		determine whether any of the fields are set to null
		Here is an example
	
	public int getLength()
	{
		int len = 0;
		
		if (lastName != null)
			len += lastName.length();
		if (firstName != null)
			len += firstName.length();
		if (middleName != null)
			len += middleName.length();
		return len;	
	}
	
	*/
	/**
	The toString method returns the full name.
	@return A reference to a String.
	*/
	
	public String toString()
	{
		return firstName + " " + middleName + " " + lastName;
	}
	
}
