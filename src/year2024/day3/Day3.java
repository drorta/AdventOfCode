package year2024.day3;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Day3 {

    public static void main(String[] args) {
        try {
            URI fileName = (new Object(){}).getClass().getResource("day.txt").toURI();
            String input = Files.readAllLines(Paths.get(fileName)).toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
