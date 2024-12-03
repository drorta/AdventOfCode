package year2024.day2;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Day2 {

    public static boolean isValidUpwards(String[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (Integer.parseInt(nums[i]) >= Integer.parseInt(nums[i + 1]) || Integer.parseInt(nums[i + 1]) - Integer.parseInt(nums[i]) > 3) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidUpwards2(String[] nums) {
        int dampened = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (Integer.parseInt(nums[i]) >= Integer.parseInt(nums[i + 1]) || Integer.parseInt(nums[i + 1]) - Integer.parseInt(nums[i]) > 3) {
                if ((Integer.parseInt(nums[i]) <= Integer.parseInt(nums[i + 2]) ||
                        Integer.parseInt(nums[i + 2]) - Integer.parseInt(nums[i]) < 3) && dampened < 1) {
                    dampened++;
                    i++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidDownwards(String[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (Integer.parseInt(nums[i]) <= Integer.parseInt(nums[i + 1]) || Integer.parseInt(nums[i]) - Integer.parseInt(nums[i + 1]) > 3) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidDownwards2(String[] nums) {
        int dampened = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (Integer.parseInt(nums[i]) <= Integer.parseInt(nums[i + 1]) || Integer.parseInt(nums[i]) - Integer.parseInt(nums[i + 1]) > 3) {
                if ((Integer.parseInt(nums[i]) >= Integer.parseInt(nums[i + 2]) ||
                        Integer.parseInt(nums[i + 2]) - Integer.parseInt(nums[i]) < 3) && dampened < 1) {
                    dampened++;
                    i++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static int solutionPart1(String[] input) {
        int safes = 0;
        for (int i = 0; i < input.length; i++) {
            String[] current = input[i].split(" ");
            if (isValidUpwards(current) || isValidDownwards(current)) {
                safes++;
            }
        }
        return safes;
    }

    public static int solutionPart2(String[] input) {
        int safes = 0;
        for (int i = 0; i < input.length; i++) {
            String[] current = input[i].split(" ");
                if (isValidUpwards2(current) || isValidDownwards2(current)) {
                safes++;
            }
        }
        return safes;
    }

    public static void main(String[] args) {
        try {
            URI fileName = (new Object() {
            }).getClass().getResource("day.txt").toURI();
            String[] input = Files.readAllLines(Paths.get(fileName)).toArray(new String[0]);
            System.out.println(solutionPart1(input));
            System.out.println(solutionPart2(input));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
