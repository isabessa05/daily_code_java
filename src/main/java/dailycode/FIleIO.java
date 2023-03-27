package dailycode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleIO {
    public static void printFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.err.println("Error reading file:" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "/Users/alfredooviedo/Downloads/daily_programming/random.txt";
        printFile(filePath);
    }
}
