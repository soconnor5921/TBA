package Rooms;

import People.Player;

public class HintRoom extends Room
{
    public HintRoom(int x, int y)
    {
        super(x,y);
    }

    public void enterRoom(Player x)
    {
        System.out.println("Welcome to the hint room, the X coordinate of the Winning Room is " + WinningRoom.xLoc);
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public void leaveRoom()
    {
        occupant = null;
    }
}
