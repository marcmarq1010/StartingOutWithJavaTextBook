import java.util.Scanner;

public class DriverExamTester 
{

	public static void main(String[] args)
	{
		DriverExam exam = new DriverExam();
		
		char[] answers = new char[20];
		
		enterAnswers(answers);
		
		exam.setStudentAnswers(answers);
		
		displayInformation(exam);
	}
	
	public static void enterAnswers(char[] answers)
	{
		Scanner keyboard = new Scanner(System.in);
		
		char answer;

		System.out.printf("Enter the student's answers to the DMV Driver Exam.\n");
		
		for(int i = 0; i < answers.length; i++)
		{
			System.out.printf("Enter the answer for number %d:\n", i + 1);
			answer = keyboard.next().charAt(0);
			
			while(answer != 'A' && answer != 'B' && answer != 'C' && answer != 'D')
			{
				System.out.printf("Input Validation: Only enter the letters A, B, C, or D as answers.\n");
				answer = keyboard.next().charAt(0);
			}
			
			answers[i] = answer;
		}
		
		keyboard.close();
	}
	
	public static void getIncorrectAnswers(DriverExam exam)
	{
		for(int i = 0; i < exam.questionsMissed().length; i++)
		{
			if(exam.questionsMissed()[i] != 0)
			{
				System.out.printf("%d, ", exam.questionsMissed()[i]);
			}
		}
	}
	
	public static void displayInformation(DriverExam exam)
	{
		if(exam.passed())
			System.out.printf("The test recieved a passing score.\n");
				
		System.out.printf("The score is: %d / %d\n",exam.totalCorrect(), exam.numberfQuestions());
		
		System.out.printf("The total correct answers is: %d\n", exam.totalCorrect());
		
		System.out.printf("The total incorrect answers is: %d\n", exam.totalIncorrect());
		
		System.out.printf("The incorrect questions are:\n");
		
		getIncorrectAnswers(exam);
		
		System.out.println();
	}

}
