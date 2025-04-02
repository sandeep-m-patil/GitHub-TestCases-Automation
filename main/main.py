class Solution:
    def longestMountain(self, arr):
        n = len(arr)
        if n < 3:
            return 0
<<<<<<< HEAD

        longest = 0
#modified py.
=======
        
        longest = 0
        
>>>>>>> 5e04b86958496491cd0de0813fa6ea8391d2cff2
        for i in range(1, n - 1):
            # Check if arr[i] is a peak
            if arr[i - 1] < arr[i] > arr[i + 1]:
                left = i - 1
                right = i + 1

                # Expand to the left (avoid flat sections)
                while left > 0 and arr[left - 1] < arr[left]:
                    left -= 1

                # Expand to the right (avoid flat sections)
                while right < n - 1 and arr[right] > arr[right + 1]:
                    right += 1

                # Only count valid mountain if length >= 3
                length = right - left + 1
                if length >= 3:
                    longest = max(longest, length)

<<<<<<< HEAD
        return longest

=======
        return longest
>>>>>>> 5e04b86958496491cd0de0813fa6ea8391d2cff2
