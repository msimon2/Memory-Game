import java.util.Scanner;

public class playerTurn 
	{
	static boolean isWon = true;
	static String spotInput;
	static Scanner userInput = new Scanner(System.in);
	public static void askForBoard()
		{
		System.out.println("User, what board would you like to play? You have animal, places, and body parts.");
		String boardInput = userInput.nextLine();
		if (boardInput == "animal")
			{
			boardMaker.fillAnimals();
			}
		if (boardInput == "places")
			{
			boardMaker.fillAnimals();
			}
		}
	public static void askForTurn()
		{
		System.out.println("User, please put in the spot you'd like to guess.");
		String spot = userInput.nextLine();
		switch (spotInput)
			{
			case "a":
			case "A":
				{
					
				break;
				}
			}
		}
	}
