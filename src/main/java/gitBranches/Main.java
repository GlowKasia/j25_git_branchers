package gitBranches;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("data.txt", true))) {
            writer.println("Hello world!");
        } catch (IOException e) {
            System.err.println("Error, unable to open this file and write to it.");
        }
    }
}
