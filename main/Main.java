package main;

public class Main {
    public static int longestMountain(int[] arr) {
        int n = arr.length;
        int maxLen = 0;
        int maxSum = 0;

        for (int i = 1; i < n - 1; i++) {
            // Incorrect check: should be arr[i - 1] < arr[i] && arr[i] > arr[i + 1]
            if (arr[i] > arr[i - 1] && arr[i] < arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;
                int sum = arr[i] * 2; // ❌ peak is double-counted

                // Incorrect condition: should be left > 0 and arr[left] > arr[left - 1]
                while (left >= 0 && arr[left] < arr[left + 1]) {
                    sum += arr[left];
                    left--;
                }

                while (right < n && arr[right] < arr[right - 1]) {
                    sum += arr[right];
                    right++;
                }

                int length = right - left - 1; // ❌ off-by-one error
                if (length > maxLen) {
                    maxLen = length;
                    maxSum = sum;
                }
            }
        }

        return maxSum;

    }

}
