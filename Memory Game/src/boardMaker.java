import java.util.*;

public class boardMaker 
	{
	static String [] [] board = new String [4][4];
	static ArrayList animalLists = new ArrayList();
	static ArrayList bodyLists = new ArrayList();
	static ArrayList placesLists = new ArrayList();
	public static void makeBoard()
		{
		for (int row=0; row<board.length; row++)
			{
			for (int col=0; col<board[0].length; col++)
				{
				board[row][col]= "       ";
				}
			}
		}
	public static void fillBoard()
		{
		animalLists.add("bison");
		animalLists.add("bison");
		animalLists.add("camel");
		animalLists.add("camel");
		animalLists.add("koala");
		animalLists.add("koala");
		animalLists.add("tiger");
		animalLists.add("tiger");
		animalLists.add("horse");
		animalLists.add("horse");
		animalLists.add("hippo");
		animalLists.add("hippo");
		animalLists.add("moose");
		animalLists.add("moose");
		animalLists.add("geese");
		animalLists.add("geese");
		
		bodyLists.add("mouth");
		bodyLists.add("mouth");
		bodyLists.add("knees");
		bodyLists.add("knees");
		bodyLists.add("teeth");
		bodyLists.add("teeth");
		bodyLists.add("wrist");
		bodyLists.add("wrist");
		bodyLists.add("elbow");
		bodyLists.add("elbow");
		bodyLists.add("ankle");
		bodyLists.add("ankle");
		bodyLists.add("heart");
		bodyLists.add("heart");
		bodyLists.add("thigh");
		bodyLists.add("thigh");

		placesLists.add("Tokyo");
		placesLists.add("Tokyo");
		placesLists.add("Paris");
		placesLists.add("Paris");
		placesLists.add("Seoul");
		placesLists.add("Seoul");
		placesLists.add("Tampa");
		placesLists.add("Tampa");
		placesLists.add("Miami");
		placesLists.add("Miami");
		placesLists.add("Chile");
		placesLists.add("Chile");
		placesLists.add("China");
		placesLists.add("China");
		
		Collections.shuffle(animalLists);
		Collections.shuffle(bodyLists);
		Collections.shuffle(placesLists);
		}
	public static void fillAnimals()
		{
		for (int row = 0 ; row < 8 ; row ++)
			{
			for (int col = 0 ; col < 8 ; col ++ )
				{
				for ( int i = 0 ; i <animalLists.size(); i++)
					{
					board[row][col] = animalLists.get(i);
					}
				}
			}
		}
	public static void displayBoard()
		{
		System.out.println("      1       2       3       4");
		System.out.println("  —————————————————————————————————");
		System.out.println("A |" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|" + board[0][3] + "|");
		System.out.println("  —————————————————————————————————");
		System.out.println("B |" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|" + board[1][3] + "|");
		System.out.println("  —————————————————————————————————");
		System.out.println("C |" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|" + board[2][3] + "|");
		System.out.println("  —————————————————————————————————");
		System.out.println("D |" + board[3][0] + "|" + board[3][1] + "|" + board[3][2] + "|" + board[3][3] + "|");
		System.out.println("  —————————————————————————————————");
		System.out.println();
		}
	}






