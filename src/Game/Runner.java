package Game;

import People.Player;
import Areas.Area;
import java.util.Scanner;

/**
 * Make it so you can press M to show the map and so it doesn't tell you to stay in the playable area if you type M or other buttons TBD
 */

public class Runner
{
    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        Area[][] town = new Area[5][5];
        for(int x = 0; x < town.length; x++)
        {
            for(int y = 0; y < town[x].length; y++)
            {
                town[x][y] = new Area(x,y);
            }
        }

        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        //Set up player
        Player player1 = new Player(name, 0, 0);

        while(gameOn)
        {
            System.out.println("Hello " + name + ", move in your preferred direction using the 'W A S D' keys, or press M to show the map.");
            String move = in.nextLine();
            if(canMove(move, player1))
            {
                System.out.println("You are now at coordinates x= " + player1.getxLoc() + " y= " + player1.getyLoc());
                String map = printMap(town, player1);
                System.out.println(map);
            }
            else
            {
                System.out.println("Please stay in the playable area. Pick another direction");
            }
        }
    }

    /**
     * Creates a map of the area and shows where certain things are such as the player
     * @param map the 2D array of areas
     * @param p the player
     * @return the full created map
     */
    public static String printMap(Area[][] map, Player p)
    {
        String printedMap = "";
        for(int i = 0; i < map.length; i++)
        {
            for(int j = 0; j < map[i].length; j++)
            {
                if(i == p.getxLoc() && j == p.getyLoc())
                {
                    printedMap += "[P]";
                }
                else
                {
                    printedMap += "[?]";
                }
            }
            printedMap += "\n";
        }
        printedMap += "Index : P - Player";
        return printedMap;
    }

    /**
     * Checks if the player's move is valid and if it is, moves the player to that location
     * @param move the player's desired direction
     * @param p the player
     * @return true if the move is valid, false if it's not
     */
    public static boolean canMove(String move, Player p)
    {
        move = move.toLowerCase().trim();
        int x = p.getxLoc();
        int y = p.getyLoc();

        if(move.equals("w") && x != 0)
        {
            p.setxLoc(p.getxLoc()-1);
            return true;
        }
        else if(move.equals("a") && y != 0)
        {
            p.setyLoc(p.getyLoc()-1);
            return true;
        }
        else if(move.equals("s") && x != 4)
        {
            p.setxLoc(p.getxLoc()+1);
            return true;
        }
        else if(move.equals("d") && y != 4)
        {
            p.setyLoc(p.getyLoc()+1);
            return true;
        }
        else
        {
            return false;
        }
    }
}
