public class Solution {

    public static int solutionPart1(String input){
        int floor = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                floor++;
            } else if (input.charAt(i) == ')') {
                floor--;
            }
        }
        return floor;
    }

    public static int solutionPart2(String input){
        int position = 0;
        int floor = 0;
        for (int i = 0; i < input.length(); i++) {
            position = i+1;
            if (solutionPart1(input.substring(0, i+1)) < 0) {
                return position;
            }
        }
        return 0;
    }

}
