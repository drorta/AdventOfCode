import java.util.Arrays;

public class Solution {

    public static int solution(int l, int w, int h){
        int s1 = 2 * l * w;
        int s2 = 2 * w * h;
        int s3 = 2 * h * l;
        int[] arr = {s1,s2,s3};
        Arrays.sort(arr);

    }

}
