import java.util.List;

class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible value
        int n = arr.size();
        
        // Iterate through the array, comparing adjacent elements
        for (int i = 0; i < n - 1; i++) {
            int sum = arr.get(i) + arr.get(i + 1); // Sum of adjacent elements
            maxSum = Math.max(maxSum, sum); // Update maxSum if we found a larger sum
        }
        
        return maxSum;
    }
}
