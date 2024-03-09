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
        for (int i = 1; i <= column; i++)
        {
            for (int j = 1; j <= row; j++)
            {
                printTile(i,j);
            }
            System.out.println();
        }

    }

    public void printTile(int x, int y)
    {
        if(gameMap[x][y] instanceof EmptyBox)
        {
            System.out.print(map.getAroundNR(x,y)+" ");
        }
        else{
            System.out.print("* ");
        }
    }
}
