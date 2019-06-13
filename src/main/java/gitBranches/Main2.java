package gitBranches;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        int counter = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Liczba ljnii:" + counter);
    }
}
