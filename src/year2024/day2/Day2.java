package year2024.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Day2 {

    public static void main(String[] args) {
        try {
            String[] input = Files.readAllLines(Paths.get("src/year2024.day1/year2024/day2.txt")).toArray(new String[0]);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
