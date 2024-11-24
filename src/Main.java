import java.util.Arrays;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {5,20,-2};
        int min = Arrays.stream(arr).min().getAsInt();
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }

}