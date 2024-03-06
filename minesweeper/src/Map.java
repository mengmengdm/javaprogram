import java.util.Random;
public class Map {
    private Tile[][] gameMap;
    private int row;
    private int column;
    private int mineNr;
    public int aroundNr;
    public Map(int row, int column, int mineNr)
    {
        this.row= row;
        this.column = column;
        this.mineNr = mineNr;
        this.gameMap =  new Tile[row][column];
    }
    private void initialMap()
    {
        for(int i = 0; i < mineNr+1; i++)
        {
            Random random = new Random();
            int randomX = random.nextInt(column+1);
            int randomY = random.nextInt(row+1);
            gameMap[randomX][randomY] = new MineBox();
        }
        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<column; j++)
            {
                if(gameMap[i][j] == null)
                {
                    gameMap[i][j] = new EmptyBox();
                }
            }
        }
    }

    public int getAroundNR()
    {

        return aroundNr;
    }
    public boolean openTile()
    {
        return false;
    }
}
