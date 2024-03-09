public class Game {
    enum gamestatus_enum{
        initial, going, win, lose
    }
    enum difficulty_enum{
        difficult, moderate, easy
    }
    private gamestatus_enum gameStatus;
    private difficulty_enum difficulty;
    public Game()
    {
        gameStatus = gamestatus_enum.initial;
    }
    public void setDifficulty()
    {

    }
    public void controlGame()
    {

    }

    public static void main(String[] args) {
        Map gameMap = new Map(8,8,5);
        Visulization visulization = new Visulization(gameMap);
    }
}
