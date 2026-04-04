import java.util.*;

public class lecture {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 12, 47, 34, 10 };
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(findMax(arr));
        System.out.println(maxInRange(arr, 0, 2));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    public static int maxInRange(int[] arr, int start, int end) {
        if (arr.length == 0 || start > end)
            return -1;
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    public static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            swap(arr, i, n - i - 1);
        }
    }
}
