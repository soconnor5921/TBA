package People;

public class Player
{
    String name;
    int xLoc, yLoc;

    public int health = 10;
    public boolean inCombat = false;

    public int getxLoc(){return xLoc;}
    public void setxLoc(int xLoc){this.xLoc = xLoc;}
    public int getyLoc(){return yLoc;}
    public void setyLoc(int yLoc){this.yLoc = yLoc;}

    public Player(String name, int xLoc, int yLoc)
    {
        this.name = name;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }
}
