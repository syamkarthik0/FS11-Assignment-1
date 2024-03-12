public class MaxElement {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        int max = findMax(arr);
        System.out.println("Maximum element in the array is: " + max);
    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}