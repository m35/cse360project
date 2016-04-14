/**
 * Class a Player to keep track of their name and stats as the game progresses.
 * 
 * @author Thomas Gottschlich for CSE360
 * @version Apr 8 2016 
 * @pin 326
 */
package cse360pro1;

public class Player 
{
	private String name; 
	private int score;
	private int lifeTimeScore;
	private int numberOfRolls;
	
	private int ones;
	private int twos;
	private int threes;
	private int fours;
	private int fives; 
	private int sixes;
	
	
	private int wins;
	private int losses;
	
	private double winLossRatio;
	
	/**
	 * Creates a user to play the game and track statistics. If user has never played stats
	 * are set to zero else the stats are read in.
	 * 
	 * @param name - player name
	 */
	Player(String name)
	{	
		this.name = name;
		score = 0;
		lifeTimeScore = 0;
		numberOfRolls = 0;
		
		ones = 0;
		twos = 0;
		threes = 0;
		fours = 0;
		fives = 0; 
		sixes = 0;
		
		wins = 0;
		losses = 0;
		
		winLossRatio = 0.0;	
	}
	
	
	/**
	 * Updates the score of the user based on their roll.
	 * 
	 * @param roll - dice number that is rolled
	 */
	public void updateScore(int roll)
	{
		this.score += roll;
	}
	
	/**
	 * Updates the number of times the player has rolled a specific number on the dice.
	 * 
	 * @param roll - dice number that is rolled
	 */
	public void updateRollStats(int roll)
	{
		if(roll == 1)
			this.ones += 1;
		else if(roll == 2)
			this.twos += 1;
		else if(roll == 3)
			this.threes += 1;
		else if(roll == 4)
			this.fours += 1;
		else if(roll == 5)
			this.fives += 1;
		else if(roll == 6)
			this.sixes += 1;
	}
	
	/**
	 * Updates the users wins, losses and win loss ratio
	 * 
	 * @param win - if the player has won or not.
	 */
	public void updateWinLoss(boolean win)
	{
		if(win)
			this.wins += 1;
		else
			this.losses += 1;
		
		this.winLossRatio = this.wins / (this.wins + this.losses);	
	}
	
	/**
	 * Gets the users name 
	 *
	 * @return name - the users name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Get the users score
	 * 
	 * @return score - current game score
	 */
	public int getScore()
	{
		return this.score;
	}
	
	/**
	 * Get the life time score of the user
	 * 
	 * @return	lifeTimeScore - the overall score the user has accumlated
	 */
	public int getLifeTimeScore()
	{
		return this.lifeTimeScore;
	}
	
	
	/**
	 * Gets the number of rolls the user has made throughout all their games
	 * 
	 * @return	numberOfRolls -  the number of rolls the user has made overall
	 */
	public int getNumberOfRolls()
	{
		return this.numberOfRolls;
	}
	
	/**
	 * Get the number of ones the user has rolled throughout every game played
	 * 
	 * @return ones - the number of ones rolls 
	 */
	public int getOnes()
	{
		return this.ones;
	}
	
	/**
	 * Get the number of twos the user has rolled throughout every game played
	 * 
	 * @return twos - the number of twos rolls 
	 */
	public int getTwos()
	{
		return this.twos;
	}
	
	/**
	 * Get the number of threes the user has rolled throughout every game played
	 * 
	 * @return threes - the number of threes rolls 
	 */
	public int getThrees()
	{
		return this.threes;
	}
	
	/**
	 * Get the number of fours the user has rolled throughout every game played
	 * 
	 * @return fours - the number of fours rolls 
	 */
	public int getFours()
	{
		return this.fours;
	}
	
	/**
	 * Get the number of fives the user has rolled throughout every game played
	 * 
	 * @return fives - the number of fives rolls 
	 */
	public int getFives()
	{
		return this.fives;
	}
	
	/**
	 * Get the number of sixes the user has rolled throughout every game played
	 * 
	 * @return sixes - the number of sixes rolls 
	 */
	public int getSixes()
	{
		return this.sixes;
	}
	
	/**
	 * Get the number of all the wins the user earned
	 * 
	 * @return wins - the number of wins 
	 */
	public int getWins()
	{
		return this.wins;
	}
	
	/**
	 * Get the total number of losses the user has
	 * 
	 * @return losses - the number of losses
	 */
	public int getLosses()  
	{
		return this.losses;
	}
	
	/**
	 * Get the win to loss ratio of the user 
	 * 
	 * @return winLossRatio - ratio of wins and losses
	 */
	public double getRatio()
	{
		return this.winLossRatio;
	}
	
	/**
	 * Get the number of games the user has played
	 * 
	 * @return numberOfGame - total games played
	 */
	public int getNumberOfGame()
	{
		return this.wins + this.losses;
	}
	
}