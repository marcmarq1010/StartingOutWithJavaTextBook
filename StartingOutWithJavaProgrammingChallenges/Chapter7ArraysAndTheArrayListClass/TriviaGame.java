import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TriviaGame
{

	public static void main(String[] args) throws IOException
	{
		ArrayList<Question> questions = new ArrayList<Question>();
		
		ArrayList<Integer> answers = new ArrayList<Integer>();
		
		int player1Points = 0,
			player2Points = 0;
		
		final int NUM_OF_QUESTIONS = 10;
		
		readTriviaQuestionsFromFile(questions, NUM_OF_QUESTIONS);
		
		startGame();
		
		for(int i = 0; i < NUM_OF_QUESTIONS; i++)
		{
			turnsAnswering(questions, answers, i);
		}
		
		player1Points = calculatePoints(answers, 0, 5);
		
		player2Points = calculatePoints(answers, 5, 10);
		
		displayWinner(player1Points, player2Points);
		
	}
	
	public static void readTriviaQuestionsFromFile(ArrayList<Question> questions, int NUM_OF_QUESTIONS) throws IOException
	{
		File file = new File("TriviaQuestions.txt");
		
		Scanner inputFile = new Scanner(file);

		for(int i = 0; i < NUM_OF_QUESTIONS; i++)
		{
			Question question = new Question();
			
			question.setTriviaQuestion(inputFile.nextLine());
			
			question.setPossibleAnswerOne(inputFile.nextLine());
			
			question.setPossibleAnswerTwo(inputFile.nextLine());
			
			question.setPossibleAnswerThree(inputFile.nextLine());
			
			question.setPossibleAnswerFour(inputFile.nextLine());
			
			question.setCorrectAnswer(inputFile.nextLine());
			
			questions.add(question);
		}
		
		inputFile.close();
	}
	
	public static void startGame()
	{
		System.out.printf("In this programming challenge, you will play a simple trivia game for two players.\n");
		
		System.out.printf("Starting with player 1, each player gets a turn at answering 5 trivia questions.\n");
		
		System.out.printf("(There are 10 questions, 5 for each player.)\n");
	}
	
	public static void turnsAnswering(ArrayList<Question> questions, ArrayList<Integer> answers, int i)
	{
		Scanner keyboard = new Scanner(System.in);
		
		char answer;
		
		System.out.printf("Question number %d: %s\n", i + 1, questions.get(i).getTriviaQuestion());
		
		System.out.printf("1) %s\n", questions.get(i).getPossibleAnswerOne());
		
		System.out.printf("2) %s\n", questions.get(i).getPossibleAnswerTwo());

		System.out.printf("3) %s\n", questions.get(i).getPossibleAnswerThree());

		System.out.printf("4) %s\n", questions.get(i).getPossibleAnswerFour());
		
		System.out.println();
		
		System.out.printf("Choose an answer. (1, 2, 3, or 4)\n");
		answer = keyboard.next().charAt(0);
		
		while(answer < 1 || answer > 4)
		{
			System.out.printf("Input Invalidation: Enter 1, 2, 3, or 4\n");
			answer = keyboard.next().charAt(0);
		}
		
		if(answer == questions.get(i).getCorrectAnswer().charAt(0))
			answers.add(i, 1);
	}
	
	public static int calculatePoints(ArrayList<Integer> answers, int playerStart, int playerStop )
	{
		int total = 0;
		for(int i = playerStart; i < playerStop; i ++)
		{
			if(answers.get(i) == 1)
				total++;
		}	
		
		return total;
	}
	
	public static void displayWinner(int player1Points, int player2Points)
	{
		if(player1Points > player2Points)
			System.out.printf("Player 1 wins!!\n");
		else if(player1Points > player2Points)
			System.out.printf("Player 2 wins!!\n");
		else
			System.out.printf("It is a tie!!\n");
	}

}
