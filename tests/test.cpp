#include <iostream>
#include <vector>
#include <cstdlib>  // for abs
using namespace std;

// Function to compute sorted squares using two-pointer approach
vector<int> sortedSquares(const vector<int>& nums) {
    int left = 0, right = nums.size() - 1;
    vector<int> result(nums.size());
    int pos = nums.size() - 1;
    
    while (left <= right) {
        if (abs(nums[left]) > abs(nums[right])) {
            result[pos] = nums[left] * nums[left];
            left++;
        } else {
            result[pos] = nums[right] * nums[right];
            right--;
        }
        pos--;
    }
    return result;
}

void runTestCases() {
    // Test cases and their expected outputs
    vector<vector<int>> testCases = {
        {-10, -3, -2, 0, 1, 5, 7, 12},       // Test Case 1
        {-10000, -500, -1, 0, 2, 3, 4000},    // Test Case 2
        {-9, -8, -5, -3, -2, 0, 1, 4, 6, 10}, // Test Case 3
        {-7, -3, 2, 3, 11},                  // Test Case 4
        {-6, -5, -3, -1, 0, 2, 3, 4, 8}       // Test Case 5
    };
    
    vector<vector<int>> expectedOutputs = {
        {0, 1, 4, 9, 25, 49, 100, 144},        // Expected Output for Test Case 1
        {0, 1, 4, 9, 250000, 16000000, 100000000}, // Expected Output for Test Case 2
        {0, 1, 4, 9, 16, 25, 36, 64, 81, 100},   // Expected Output for Test Case 3
        {4, 9, 9, 49, 121},                     // Expected Output for Test Case 4
        {0, 1, 4, 9, 9, 16, 25, 36, 64}          // Expected Output for Test Case 5
    };
    
    for (size_t i = 0; i < testCases.size(); i++) {
        vector<int> result = sortedSquares(testCases[i]);
        
        // Print test case number
        cout << "\nTest Case " << i + 1 << "\n";
        
        // Print input given
        cout << "Input Given: {";
        for (size_t j = 0; j < testCases[i].size(); j++) {
            cout << testCases[i][j];
            if (j < testCases[i].size() - 1) cout << ", ";
        }
        cout << "}\n";
        
        // Print resultant output
        cout << "Resultant Output: {";
        for (size_t j = 0; j < result.size(); j++) {
            cout << result[j];
            if (j < result.size() - 1) cout << ", ";
        }
        cout << "}\n";
        
        // Check if the result matches the expected output
        bool passed = (result == expectedOutputs[i]);
        cout << "Test Case: " << (passed ? "✅ Passed" : "❌ Not Passed") << "\n";
    }
}

int main() {
    runTestCases();
    return 0;
}
