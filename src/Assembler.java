import java.util.ArrayList;
import java.util.regex.*;

public class Assembler {

    Pattern[] instructions = new Pattern[14];
    ArrayList<String> compactedLines = new ArrayList<>();

    Assembler(String[] lines){
        Pattern label = Pattern.compile("(([a-z]|[A-Z])*\\:(.*))");
        for (String s : lines){
            s = s.strip();
            if(!s.isEmpty()){
                Matcher matcher = label.matcher(s);
                if(matcher.matches()){ //Row has label

                }
            }
        }

        instructions[0] = Pattern.compile();
        instructions[1] = Pattern.compile();
        instructions[2] = Pattern.compile();
        instructions[3] = Pattern.compile();
        instructions[4] = Pattern.compile();
        instructions[5] = Pattern.compile();
        instructions[6] = Pattern.compile();
        instructions[7] = Pattern.compile();
        instructions[8] = Pattern.compile();
        instructions[9] = Pattern.compile();
        instructions[10] = Pattern.compile();
        instructions[11] = Pattern.compile();
        instructions[12] = Pattern.compile();
        instructions[13] = Pattern.compile();
    }

    void firstPass(){

    }

    void secondPass(){

    }

}
