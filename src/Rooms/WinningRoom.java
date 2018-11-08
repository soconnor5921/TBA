package Rooms;

import People.Player;
import Game.Runner;

public class WinningRoom extends Room
{

    public WinningRoom(int x, int y)
    {
        super(x,y);
    }

    public void enterRoom(Player p)
    {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        System.out.println("You have won the game! Congratulations!");
        Runner.gameOff();
    }
}
