package Rooms;

import People.Player;

public class Room
{
    Player occupant;
    int xLoc, yLoc;

    public Room(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    public void enterRoom(Player x)
    {
        System.out.println("You are nowhere");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
}
