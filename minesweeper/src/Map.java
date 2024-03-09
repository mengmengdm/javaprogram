import java.util.Random;
public class Map {
    private Tile[][] gameMap;
    private int row;
    private int column;
    private int mineNr;
    public Map(int row, int column, int mineNr)
    {
        this.row= row;
        this.column = column;
        this.mineNr = mineNr;
        this.gameMap =  new Tile[row+2][column+2];
        initialMap();
    }
    private void initialMap()
    {
        Random random = new Random();
        //putting mines, we assusme that the real map is from (1,1) to (column, row)
        for(int i = 1; i <= mineNr; i++)
        {
            //generate random numbers from 1 to column/row
            int randomX = random.nextInt(column)+1;
            int randomY = random.nextInt(row)+1;
            gameMap[randomX][randomY] = new MineBox();
            //test code showing where the mines are
            System.out.println("the position of mine "+ i + " is ("+randomX+","+randomY+")");
        }
        for(int i = 0; i < row + 1; i++)
        {
            for(int j = 0; j < column + 1; j++)
            {
                if(gameMap[i][j] == null)
                {
                    gameMap[i][j] = new EmptyBox();
                    //System.out.println("eb");
                }
            }
        }
    }

    public int getAroundNR(int x,int y)
    {
        int aroundNr = 0;
        if(x == 0 || y == 0 || x == column+1 || y == row+1 )
        {
            //System.out.println("plese enter the right number between (0,0) and"+"("+column+","+row+")");
        }
        else
        {
            for (int i = x-1; i <= x+1; i++)
            {
                for (int j = y-1; j <= y+1; j++)
                {
                    if(i == x && j == y )
                    {
                        continue;
                    }
                    if(gameMap[i][j] instanceof MineBox)
                    {
                        aroundNr++;
                    }
                }
            }

        }
        return aroundNr;
    }
    public boolean openTile()
    {
        return false;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public Tile[][] getGameMap() {
        return gameMap;
    }
}
