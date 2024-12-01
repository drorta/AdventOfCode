package year2024.day1;

import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Day1 {

    public static int solutionPart1(String[] input){
        int[] right = new int[input.length];
        int[] left = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            String[] distances = input[i].split("   ");
            right[i] = Integer.parseInt(distances[1]);
            left[i] = Integer.parseInt(distances[0]);
        }
        right = Arrays.stream(right).sorted().toArray();
        left = Arrays.stream(left).sorted().toArray();
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += Math.abs(left[i] - right[i]);
        }
        return sum;
    }

    public static int countVal(int[] arr, int val){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                count++;
            }
        }
        return count;
    }

    public static int solutionPart2(String[] input){
        int[] right = new int[input.length];
        int[] left = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            String[] distances = input[i].split("   ");
            right[i] = Integer.parseInt(distances[1]);
            left[i] = Integer.parseInt(distances[0]);
        }
        int sumSim = 0;
        for (int i = 0; i < input.length; i++) {
            sumSim += left[i] * countVal(right, left[i]);
        }
        return sumSim;
    }

    public static void main(String[] args) {
        try {
            URI fileName = (new Object(){}).getClass().getResource("day.txt").toURI();
            String[] input = Files.readAllLines(Paths.get(fileName)).toArray(new String[0]);
            System.out.println(solutionPart1(input));
            System.out.println(solutionPart2(input));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
