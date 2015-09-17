import java.util.*;

public class gameRunner 
	{
	public static void main(String[] args) 
		{
		boardMaker.makeBoard();
		boardMaker.displayBoard();
		boardMaker.fillBoard();
		playerTurn.askForBoard();
		while (playerTurn.isWon)
			{
			playerTurn.askForTurn();

			}
		}
	}
