import java.util.Scanner;
public class Visulization {
    private int row;
    private int column;
    private Map map;
    private Tile[][] gameMap;
    public Visulization(Map m)
    {
        this.map = m;
        row = map.getRow();
        column = map.getColumn();
        gameMap = map.getGameMap();
        //initial map
        printMap();
    }

    public void printMap()
    {
        System.out.print("  ");
        for (int i = 1; i <= column; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i <= column; i++)
        {
            System.out.print(i + " ");
            for (int j = 1; j <= row; j++)
            {
                printTile(j,i);
            }
            System.out.println();
        }
        for (int i = 1; i <= column; i++)
        {
            System.out.print("--");
        }
        System.out.println();
    }
    public void printTile(int x, int y)
    {
        if(gameMap[x][y].getStatus() == Tile.tile_status.opened) {
            if (gameMap[x][y] instanceof EmptyBox) {
                System.out.print("  ");
            }
            if (gameMap[x][y] instanceof MineBox) {
                System.out.print("* ");
            }
            if (gameMap[x][y] instanceof NumberBox) {
                System.out.print(map.getAroundNR(x, y) + " ");
            }
        }
        if (gameMap[x][y].getStatus() == Tile.tile_status.initial)
        {
            System.out.print("\u25A0"+" ");
        }
    }
    public boolean openTile(int x, int y){
        boolean safeCheck = map.openTile(x,y);
        printMap();
        return safeCheck;
    }
    public void printInstruction()
    {
        System.out.println("please enter open(x,y), flag(x,y) or unflag(x,y) to control");
    }
    public Map getMap() {
        return map;
    }
}
