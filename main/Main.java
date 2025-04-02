package main;


public class Main {
    public static int longestMountain(int[] arr) {
       //code for Longest Mountain
       if (arr.length < 3) return 0;

        int longest = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            // Check if current element is a peak
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;

                // Expand to the left
                while (left > 0 && arr[left - 1] < arr[left]) {
                    left--;
                }

                // Expand to the right
                while (right < arr.length - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                // Calculate the length of the mountain
                int length = right - left + 1;
                if (length >= 3 && length > longest) {
                    longest = length;
                }
            }
        }

        return longest;
    }
    
}
