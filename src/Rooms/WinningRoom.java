package Rooms;

import People.Player;
import Game.Runner;

public class WinningRoom extends Room
{
    public static int xLoc, yLoc;

    public WinningRoom(int x, int y)
    {
        super(x,y);
        xLoc = x;
        yLoc = y;
    }

    public void enterRoom(Player x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have won the game! Congratulations!");
        Runner.gameOff();
    }
}
