import java.util.Scanner;

public class playerTurn 
	{
	static boolean isWon = true;
	static String spotInput;
	static String firstColumn;
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
			boardMaker.fillPlaces();
			}
		if (boardInput == "body parts")
			{
			boardMaker.fillBody();;
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
				firstColumn = Integer.parseInt(spot.substring(1)-1);
				break;
				}
			}
		}
	}
