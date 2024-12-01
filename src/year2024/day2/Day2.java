package year2024.day2;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Day2 {

    public static void main(String[] args) {
        try {
            URI fileName = (new Object(){}).getClass().getResource("day.txt").toURI();
            String[] input = Files.readAllLines(Paths.get(fileName)).toArray(new String[0]);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
