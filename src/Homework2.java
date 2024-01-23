import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Homework2 {
    public static void main(String[] args) {
        String file = "/Users/felingfeling/IdeaProjects/gr37_01_22_01/src/fi_le.txt";
        String longer_Line = findLongerLine(file);

        System.out.println(longer_Line);
    }
    public static String findLongerLine (String file){

        String longer = " ";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null){
                if (line.length() > longer.length()){
                    longer = line;
                }
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return longer;
    }
}
