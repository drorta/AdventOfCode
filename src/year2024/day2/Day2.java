package year2024.day2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day2 {

    public static void main(String[] args) {
        try {
            String[] input = Files.readAllLines(Paths.get(Day2.class.getResource("day.txt").toURI())).toArray(new String[0]);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
