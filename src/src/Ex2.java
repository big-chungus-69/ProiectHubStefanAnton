import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int [] second_arr = { 3, 1, 2, 9, 5, 4, 7, 6, 8};
        System.out.println("Original array: " + Arrays.toString(second_arr));

        Arrays.sort(second_arr);
        System.out.println("Ordered array: " + Arrays.toString(second_arr));
    }
}
