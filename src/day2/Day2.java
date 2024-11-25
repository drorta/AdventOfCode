package day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Day2 {

    public static int solutionPart1(String[] lines) {
        int total = 0;
        for (String line : lines) {
            String[] measures = line.split("x");
            int l = Integer.parseInt(measures[0]);
            int w = Integer.parseInt(measures[1]);
            int h = Integer.parseInt(measures[2]);
            int s1 = 2 * l * w;
            int s2 = 2 * w * h;
            int s3 = 2 * h * l;
            int[] s = {s1, s2, s3};
            Arrays.sort(s);
            int extra = s[0] / 2;
            int sum = s1 + s2 + s3 + extra;
            total += sum;
        }
        return total;
    }

    public static int solutionPart2(String[] lines) {
        int total = 0;
        for (String line : lines){
            String[] measures = line.split("x");
            int l = Integer.parseInt(measures[0]);
            int w = Integer.parseInt(measures[1]);
            int h = Integer.parseInt(measures[2]);
            int[] s = {l, w, h};
            Arrays.sort(s);
            int ribbon = s[0]*2 + s[1]*2;
            int bow = l*w*h;
            total += ribbon + bow;
        }
        return total;
    }

    public static void main(String[] args) {
        try {
            String[] lines = Files.readAllLines(Paths.get("src/day2/day2.txt")).toArray(new String[0]);
            System.out.println(solutionPart2(lines));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
