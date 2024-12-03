package year2024.day2;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day2Tests {
    @Test
    void part1Example() {
        String[] input = {
            "7 6 4 2 1",
            "1 2 7 8 9",
            "9 7 6 2 1",
            "1 3 2 4 5",
            "8 6 4 4 1",
            "1 3 6 7 9"
        };
        assertEquals(2, Day2.solutionPart1(input));
    }

    @Test
    void part1Input() {
        try {
            URI fileName = (new Object(){}).getClass().getResource("day.txt").toURI();
            String[] input = Files.readAllLines(Paths.get(fileName)).toArray(new String[0]);
            assertEquals(252, Day2.solutionPart1(input));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void part2Example() {
        String[] input = {
                "7 6 4 2 1",
                "1 2 7 8 9",
                "9 7 6 2 1",
                "1 3 2 4 5",
                "8 6 4 4 1",
                "1 3 6 7 9"
        };
        assertEquals(4, Day2.solutionPart2(input));
    }

    @Test
    void part2Input() {
        try {
            URI fileName = (new Object(){}).getClass().getResource("day.txt").toURI();
            String[] input = Files.readAllLines(Paths.get(fileName)).toArray(new String[0]);
            assertEquals(0, Day2.solutionPart2(input));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
