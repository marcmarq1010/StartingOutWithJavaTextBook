import java.util.Scanner;

public class TestScoresTester
{
	
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		TestScores tests = new TestScores();
		
		for(int i = 1; i <= 3; i++)
		{
			System.out.printf("Enter the test score for test number %d:\n", i);
			double testScore = keyboard.nextDouble();
			
			switch(i)
			{
				case 1:
					tests.setTestScore1(testScore);
					break;
				case 2:
					tests.setTestScore2(testScore);
					break;
				case 3:
					tests.setTestScore3(testScore);
					break;
				default:
					break;
			}
		}
		
		System.out.printf("The average of the three test scores is %.2f\n", tests.getAverageTestSCores());
		
		keyboard.close();
		
	}
	
}

/*
Demonstrate the class by writing a separate program that creates an instance of the class.
The program should ask the user to enter three test scores, which are stored in the TestScores object.
Then the program should display the average of the scores, as reported by the TestScores object.
*/