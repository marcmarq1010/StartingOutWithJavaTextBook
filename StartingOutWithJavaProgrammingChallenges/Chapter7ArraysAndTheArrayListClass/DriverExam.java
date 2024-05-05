
public class DriverExam
{
	private char[] correctAnswers = {'B', 'D', 'A', 'A', 'C',
									 'A', 'B', 'A', 'C', 'D',
									 'B', 'C', 'D', 'A', 'D',
									 'C', 'C', 'B', 'D', 'A'};
	
	private char[] studentAnswers = new char[20];
	
	public DriverExam()
	{
		
	}
	
	public DriverExam(char[] array)
	{
		setStudentAnswers(array);
	}
	
	public int numberfQuestions()
	{
		return correctAnswers.length;
	}
	
	public boolean passed()
	{
		if(totalCorrect() >= 15)
			return true;
		
		else
			return false;
	}
	
	public int totalCorrect()
	{
		int totalCorrect = 0;
		
		for(int i = 0; i < correctAnswers.length; i++)
		{
			if(correctAnswers[i] == studentAnswers[i])
			{
				totalCorrect++;
			}
		}
		
		return totalCorrect;
	}
	
	public int totalIncorrect()
	{

		return 20 - totalCorrect();
	}
	
	public int[] questionsMissed()
	{
		int[] array = new int[20];
		
		for(int i = 0; i < correctAnswers.length; i++)
		{
			if(correctAnswers[i] != studentAnswers[i])
			{
				array[i] = i + 1;
			}
		}
		
		return array;
	}
	
	public void setStudentAnswers(char[] array)
	{
		int i = 0;
		
		for(char answer : array)
		{
			studentAnswers[i] = answer;
			i++;
		}
	}
}
