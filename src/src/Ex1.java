import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int [] first_arr = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        System.out.println("Original array: " + Arrays.toString(first_arr));

        Arrays.sort(first_arr);
        System.out.println("Reversed array: " + Arrays.toString(first_arr));
    }
}
