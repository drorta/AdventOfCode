package day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Day1 {

    public static int solutionPart1(String[] input){
        int rightSum = 0;
        int leftSum = 0;
        for (String line: input) {
            String[] distances = line.split("   ");
            rightSum+= Integer.parseInt(distances[0]);
            leftSum += Integer.parseInt(distances[1]);
        }
        return Math.abs(rightSum - leftSum);
    }

    public static void main(String[] args) {
        try {
            String[] input = Files.readAllLines(Paths.get("src/day1/day1.txt")).toArray(new String[0]);
            System.out.println(solutionPart1(input));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
