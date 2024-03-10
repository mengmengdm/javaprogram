import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {
    enum gamestatus_enum{
        initial, going, win, lose
    }
    enum difficulty_enum{
        difficult, regular, easy
    }
    private gamestatus_enum gameStatus;
    private difficulty_enum difficulty;
    Scanner scanner;
    Visulization visulization;
    Map gameMap;
    public Game()
    {
        scanner =  new Scanner(System.in);
        gameStatus = gamestatus_enum.initial;
        setDifficulty();
        initialGame();
    }
    public  void  setDifficulty()
    {
        System.out.println("welcome to minesweeper, please choose your difficulty");
        System.out.println("easy / regular / difficult");
        String diff = scanner.nextLine();
        if(diff.equals("difficult")){
            difficulty = difficulty_enum.difficult;
        }
        else if (diff.equals("regular")){
            difficulty = difficulty_enum.regular;
        }
        else if(diff.equals("easy")){
            difficulty = difficulty_enum.easy;
        }
        else {
            System.out.println("please choose from easy / regular / difficult and enter");
            setDifficulty();
        }
    }
    public void initialGame(){
        if(difficulty == difficulty_enum.easy)
        {
            gameMap = new Map(5,5,1);
        }
        if(difficulty == difficulty_enum.regular)
        {
            gameMap = new Map(8,8,10);
        }
        if(difficulty == difficulty_enum.difficult)
        {
            gameMap = new Map(12,12,30);
        }
        visulization = new Visulization(gameMap);
    }
    public void controlGame()
    {
        String regex = "(\\w+)\\((\\d+),(\\d+)\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(scanner.nextLine());
        if (matcher.matches()) {
            String command = matcher.group(1); // 提取指令
            int x = Integer.parseInt(matcher.group(2)); // 提取参数1
            int y = Integer.parseInt(matcher.group(3)); // 提取参数2
            if(command.equals("open"))
            {
                visulization.openTile(x,y);
            }
            if (command.equals("flag")){

            }
            if (command.equals("unflag")){

            }
        }
        else {
            System.out.println("please enter the correct form");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.visulization.openTile(2,2);
        while (true){
            game.controlGame();
        }

    }
}
