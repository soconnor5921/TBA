package Game;

import People.Player;
import Areas.Area;
import java.util.Scanner;

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
        while(gameOn == true)
        {
            System.out.println("Hello " + name + ", move in your preferred direction using the 'W A S D' keys.");
        }
    }
}
