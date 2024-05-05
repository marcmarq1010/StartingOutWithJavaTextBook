import java.util.ArrayList;

public class GradeBook
{
	
	private ArrayList<String> studentNames = new ArrayList<>();
	private double[][] testScores = new double[5][4];
	private char[] letterGrades= {'A', 'B', 'C', 'D', 'F'};
	
	public GradeBook()
	{
		
	}
	
	public ArrayList<String> getStudentNames()
	{
		return studentNames;
	}
	
	public void setTestScores(int i, int j, double score)
	{
		testScores[i][j] = score;
	}
	
	public void setStudentNames(String[] studentNames)
	{
		for(String name : studentNames)
		{
			this.studentNames.add(name);
		}
	}
	
	public String getStudentNameAtIndex(int index)
	{
		return studentNames.get(index);
	}
	
	public double averageTestScore(int studentNumber)
	{
		double total = 0.00; 
		for(int i = 0; i < testScores[0].length; i++)
		{
			total += testScores[studentNumber][i];
		}
		
		return total / testScores[0].length;
	}
	
	public double averageTestScoreDropLowest(int studentNumber)
	{
		double total = 0.00; 
		double lowest = testScores[studentNumber][0];
		
		for(int i = 0; i < testScores[0].length; i++)
		{
			if(lowest > testScores[studentNumber][i])
				lowest = testScores[studentNumber][i];
			
			total += testScores[studentNumber][i];
		}
		
		total -= lowest;
		
		return total / (testScores[0].length - 1);
	}
	
	public char getLetterGrade(double score)
	{
		if(score >= 90 && score <= 100)
			return letterGrades[0];
		else if(score >= 80 && score <= 89) 
			return letterGrades[1];
		else if(score >= 70 && score <= 79)
			return letterGrades[2];
		else if(score >= 60 && score <= 69)
			return letterGrades[3];
		else if(score >= 0 && score <= 59)
			return letterGrades[4];
		else
			return 0;
	}
	
}
