import java.util.Scanner;

public class playerTurn 
	{
	static boolean isWon = true;
	static String spotInput;
	static int columnInput;
	static int column;
	static int rows;
	static Scanner userInput = new Scanner(System.in);
	public static void askForBoard()
		{
		System.out.println("User, what board would you like to play? You have animal, places, and body parts.");
		String boardInput = userInput.nextLine();
		if (boardInput.equals("animal"))
			{
			boardMaker.fillAnimals();
			}
		if (boardInput.equals("places"))
			{
			boardMaker.fillPlaces();
			}
		if (boardInput.equals("body parts"))
			{
			boardMaker.fillBody();
			}
		}
	
	public static void askForTurn()
		{
		System.out.println("User, please put in the spot you'd like to guess.");
		String spotInput = userInput.nextLine();
		switch (spotInput.substring(0,1))
			{
			case "a":
			case "A":
				{
				columnInput = 0;
				break;
				}
			case "b":
			case "B":
				{
				columnInput = 1;
				break;
				}
			case "c":
			case "C":
				{
					System.out.println("hry");

				columnInput = 2;
				break;
				}
			case "d":
			case "D":
				{
				columnInput = 3;
				break;
				}
			}
		column= Integer.parseInt(spotInput.substring(1))-1;
		boardMaker.board[rows][column]=boardMaker.hiddenArray[rows][column];
		boardMaker.displayBoard();
		switch (spotInput.substring(0,1))
			{
			case "a":
			case "A":
				{
				columnInput = 0;
				break;
				}
			case "b":
			case "B":
				{
				columnInput = 1;
				break;
				}
			case "c":
			case "C":
				{
					System.out.println("hry");
	
				columnInput = 2;
				break;
				}
			case "d":
			case "D":
				{
				columnInput = 3;
				break;
				}
			}
		}
	}





