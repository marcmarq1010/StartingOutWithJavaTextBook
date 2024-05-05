
public class Question
{
	private String triviaQuestion;
	private String PossibleAnswerOne;
	private String PossibleAnswerTwo;
	private String PossibleAnswerThree;
	private String PossibleAnswerFour;
	private String correctAnswer;
	
	public Question()
	{
		
	}

	public String getTriviaQuestion()
	{
		return triviaQuestion;
	}

	public void setTriviaQuestion(String triviaQuestion)
	{
		this.triviaQuestion = triviaQuestion;
	}

	public String getPossibleAnswerOne()
	{
		return PossibleAnswerOne;
	}

	public void setPossibleAnswerOne(String possibleAnswerOne)
	{
		PossibleAnswerOne = possibleAnswerOne;
	}

	public String getPossibleAnswerTwo()
	{
		return PossibleAnswerTwo;
	}

	public void setPossibleAnswerTwo(String possibleAnswerTwo)
	{
		PossibleAnswerTwo = possibleAnswerTwo;
	}

	public String getPossibleAnswerThree()
	{
		return PossibleAnswerThree;
	}

	public void setPossibleAnswerThree(String possibleAnswerThree)
	{
		PossibleAnswerThree = possibleAnswerThree;
	}

	public String getPossibleAnswerFour()
	{
		return PossibleAnswerFour;
	}

	public void setPossibleAnswerFour(String possibleAnswerFour)
	{
		PossibleAnswerFour = possibleAnswerFour;
	}

	public String getCorrectAnswer()
	{
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer)
	{
		this.correctAnswer = correctAnswer;
	}

}
