import java.util.Scanner;

public class GradeBookTester
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		GradeBook myGradebook = new GradeBook();
		
		String[] studentNames = new String[5];
		
		enterStudentNames(studentNames, keyboard);
		
		enterStudentTestScores(studentNames, myGradebook, keyboard);
	
		myGradebook.setStudentNames(studentNames);
		
		displayScores(myGradebook);
		
		keyboard.close();
	
	}
	
	public static void enterStudentNames(String[] studentNames, Scanner keyboard)
	{
		for(int i = 0; i < studentNames.length; i++)
		{
			System.out.printf("Enter the name of student number %d:\n", i + 1);
			studentNames[i] = keyboard.nextLine();
		}
	}
	
	public static void enterStudentTestScores(String[] studentNames, GradeBook myGradebook, Scanner keyboard)
	{
		for(int i = 0; i < studentNames.length; i++)
		{
			System.out.printf("Enter the test scores for %s.\n", studentNames[i]);
			
			for(int j = 0; j < 4; j++)
			{
				System.out.printf("Enter test score number %d: \n", j +1);
				double score = keyboard.nextDouble();
				
				while(score < 0 || score > 100)
				{
					System.out.println("Input Validation: Do not accept test scores less than zero or greater than 100.\n");
					System.out.printf("Enter test score number %d: \n", j +1);
					score = keyboard.nextDouble();
				}
				myGradebook.setTestScores(i, j, score);
			}
		}
	}
	
	public static void displayScores(GradeBook myGradebook)
	{
		for(int i = 0; i < myGradebook.getStudentNames().size(); i++)
		{
			System.out.printf("Student number %d: %s\n", i + 1, myGradebook.getStudentNameAtIndex(i));
			
			System.out.printf("Student's average test score: %.2f\n", myGradebook.averageTestScore(i));
			
			System.out.printf("Student's letter grade: %c\n", myGradebook.getLetterGrade(myGradebook.averageTestScore(i)));
			
			System.out.printf("Student's letter grade IF lowest score is dropped: %c\n", myGradebook.getLetterGrade(myGradebook.averageTestScoreDropLowest(i)));

			System.out.println();
			
		}
	}

}

/*
Modify so that it drops each student’s lowest score when determining the test score averages and letter grades.
*/