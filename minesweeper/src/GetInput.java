import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class GetInput {
    Scanner scanner;
    GetInput(){
        scanner = new Scanner(System.in);
    }

    public boolean getInput(String s) {
        String regex = "(\\w+)\\((\\d+),(\\d+)\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            String command = matcher.group(1); // 提取指令
            int x = Integer.parseInt(matcher.group(2)); // 提取参数1
            int y = Integer.parseInt(matcher.group(3)); // 提取参数2
        }
        return false;
    }
}

