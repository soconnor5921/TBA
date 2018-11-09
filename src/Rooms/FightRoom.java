package Rooms;

import People.Player;

public class FightRoom extends Room
{
    public FightRoom(int x, int y)
    {
        super(x,y);
    }

    public void enterRoom(Player x)
    {
        System.out.println("You have encountered a monster! Press F to fight it or move in any direction to run away!");
        occupant = x;
        x.inCombat = true;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public void leaveRoom(Player x)
    {
        x.inCombat = false;
        occupant = null;
    }
}
