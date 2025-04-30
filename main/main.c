#include <stdio.h>
// Function to find the longest mountain in an array..
int longestMountain(int arr[], int n)
{ int longest = 0;
    for (int i = 1; i < arrSize - 1; i++) {
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            int left = i;
            while (left > 0 && arr[left] > arr[left - 1]) left--;
            int right = i;
            while (right < arrSize && arr[right] > arr[right + 1]) right++;  // ❌ Error: Out of bounds access
            int len = right - left + 1;
            if (len > longest) longest = len;
        }
    }
    return longest;
}
