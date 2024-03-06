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
}
