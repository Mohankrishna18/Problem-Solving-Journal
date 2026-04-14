package Day19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem1 {
    public static void main(String[] args) {
        // Replace with the actual path to your file
        String fileName = "C:\\Users\\mohan\\Desktop\\sample.txt";

        // Try-with-resources ensures BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// try (BufferedReader br = new BufferedReader(new FileReader(fileName))) { ... }

// Declares the resource inside parentheses.

// Java automatically calls close() on it when the block ends.

// No need for a finally block.

// If the file doesn’t exist, you’ll get a FileNotFoundException.