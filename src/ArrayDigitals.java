import java.util.Arrays;
/**
 * @author Zyablitsev Sergey
 * task 4.1
 */
public class ArrayDigitals {

    public static void main(String[] args) {
        int[] arr = createAndFillRandomArray(20);
        int max_negative = Integer.MIN_VALUE;
        int min_positive = Integer.MAX_VALUE;
        int positive = 0, negative = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < 0) && (max_negative < arr[i])) {
                max_negative = arr[i];
                negative = i;
            }
            if ((arr[i] >= 0) && (min_positive > arr[i])) {
                min_positive = arr[i];
                positive = i;
            }
        }
        System.out.println("Minimal positive: " + min_positive);
        System.out.println("Maximum negative: " + max_negative);
        temp = arr[negative];
        arr[negative] = arr[positive];
        arr[positive] = temp;

        System.out.println("\nArray after replace:");
        System.out.println(Arrays.toString(arr));
    }

    private static int[] createAndFillRandomArray(int n) {
        System.out.println("Source array:");
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = (int) ((Math.random() * 40)-21);
        }
        System.out.println(Arrays.toString(mas));
        return mas;

    }
}