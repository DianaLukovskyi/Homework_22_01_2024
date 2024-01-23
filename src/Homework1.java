import java.io.*;

public class Homework1 {
    public static void main(String[] args) {
        String file = "/Users/felingfeling/IdeaProjects/gr37_01_22_01/src/file.txt";
        int sum = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = bufferedReader.readLine()) != null){

                sum += Integer.parseInt(line);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());;

        }
        System.out.println("Sum from file " + sum);


    }
}
