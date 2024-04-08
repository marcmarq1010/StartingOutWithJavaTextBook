
public class TestScores
{
	private double testScore1;
	private double testScore2;
	private double testScore3;

	public TestScores()
	{
		
	}
	
	public double getAverageTestSCores()
	{
		return (getTestScore1() + getTestScore2() + getTestScore3()) / 3;
	}

	public double getTestScore1()
	{
		return testScore1;
	}

	public void setTestScore1(double testScore1)
	{
		this.testScore1 = testScore1;
	}

	public double getTestScore2()
	{
		return testScore2;
	}

	public void setTestScore2(double testScore2)
	{
		this.testScore2 = testScore2;
	}

	public double getTestScore3()
	{
		return testScore3;
	}

	public void setTestScore3(double testScore3)
	{
		this.testScore3 = testScore3;
	}
	
	
}
