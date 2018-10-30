package Areas;

import People.Player;

public class Area
{
    Player occupant;
    int xLoc, yLoc;

    public Area(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    public void enterArea(Player x)
    {
        System.out.println("You are in an uneventful area");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
}
