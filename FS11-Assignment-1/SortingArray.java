import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        // Sorting an array
        int[] arr = {5, 3, 1, 4, 2};
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Counting occurrences of a number
        int[] arrWithDuplicates = {5, 3, 1, 4, 2, 3, 3, 5};
        int target = 3;
        int count = 0;

        for (int i = 0; i < arrWithDuplicates.length; i++) {
            if (arrWithDuplicates[i] == target) {
                count++;
            }
        }

        System.out.println("Number of Occurrences of " + target + " in the Array: " + count);
    }
}
