package Game;

import People.Player;
import Rooms.HintRoom;
import Rooms.Room;
import Game.Board;
import Rooms.WinningRoom;

import java.util.Scanner;

public class Runner
{
    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        Room[][] building = new Room[5][5];
        for(int x = 0; x < building.length; x++)
        {
            for(int y = 0; y < building[x].length; y++)
            {
                building[x][y] = new Room(x,y);
            }
        }



        int x = (int)(Math.random()*building.length);
        int y = (int)(Math.random()*building.length);
        building[x][y] = new WinningRoom(x,y);

        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        //Set up player
        Player player1 = new Player(name, 0, 0);

        System.out.println("Hello " + name + ", move in your preferred direction using the 'W A S D' keys, or press M to show the map.");
        System.out.println(Board.printMap(building, player1));

        while(gameOn)
        {
            //System.out.println("Hello " + name + ", move in your preferred direction using the 'W A S D' keys, or press M to show the map.");
            String move = in.nextLine();
            move = move.trim();


            if(canMove(move, player1, building))
            {
                System.out.println("You are now at coordinates x= " + player1.getxLoc() + " y= " + player1.getyLoc());
                System.out.println(Board.printMap(building, player1));
            }
            else if(move.equalsIgnoreCase("m"))
            {
                System.out.println(Board.printMap(building, player1));
            }
            else
            {
                System.out.println("Please stay in the playable area. Pick another direction");
            }
        }
    }

    /**
     * Checks if the player's move is valid and if it is, moves the player to that location
     * @param move the player's desired direction
     * @param p the player
     * @return true if the move is valid, false if it's not
     */
    public static boolean canMove(String move, Player p, Room[][] map)
    {
        move = move.toLowerCase();
        int x = p.getxLoc();
        int y = p.getyLoc();

        if(move.equals("w") && x != 0)
        {
            map[x][y].leaveRoom();
            map[x-1][y].enterRoom(p);
            return true;
        }
        else if(move.equals("a") && y != 0)
        {
            map[x][y].leaveRoom();
            map[x][y-1].enterRoom(p);
            return true;
        }
        else if(move.equals("s") && x != 4)
        {
           map[x][y].leaveRoom();
           map[x+1][y].enterRoom(p);
            return true;
        }
        else if(move.equals("d") && y != 4)
        {
            map[x][y].leaveRoom();
            map[x][y+1].enterRoom(p);
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void gameOff()
    {
        gameOn = false;
    }
}
