package Game;

import People.Player;
import Rooms.Room;

public class Board
{
    private Room[][] map;
    private Room[][] roomsVisited;

    public Board(Room[][] x)
    {
        map = x;
    }

    public Board(int height, int width)
    {
        map = new Room[height][width];
    }

    public void addRoom(Room replace, int x, int y)
    {
        map[x][y] = replace;
    }

    /**
     * Creates a map of the area and shows where certain things are such as the player
     * @param map the 2D array of areas
     * @param p the player
     * @return the full created map
     */
    public static String printMap(Room[][] map, Player p)
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
}
