package year2024.day1;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Tests {
    @Test
    void part1Example() {
        String[] input = {
            "3   4",
            "4   3",
            "2   5",
            "1   3",
            "3   9",
            "3   3"
        };
        assertEquals(11, Day1.solutionPart1(input));
    }

    @Test
    void part1Input() {
        try {
            String[] input = Files.readAllLines(Paths.get(Day1.class.getResource("day.txt").toURI())).toArray(new String[0]);
            assertEquals(2192892, Day1.solutionPart1(input));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void part2Example() {
        String[] input = {
                "3   4",
                "4   3",
                "2   5",
                "1   3",
                "3   9",
                "3   3"
        };
        assertEquals(31, Day1.solutionPart2(input));
    }

    @Test
    void part2Input() {
        try {
            String[] input = Files.readAllLines(Paths.get(Day1.class.getResource("day.txt").toURI())).toArray(new String[0]);
            assertEquals(22962826, Day1.solutionPart2(input));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
