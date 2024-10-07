// Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or false otherwise.

 

// Example 1:

// Input: nums = [1,5,11,5]
// Output: true
// Explanation: The array can be partitioned as [1, 5, 5] and [11].
// Example 2:

// Input: nums = [1,2,3,5]
// Output: false
// Explanation: The array cannot be partitioned into equal sum subsets.
 

// Constraints:

// 1 <= nums.length <= 200
// 1 <= nums[i] <= 100

class Solution {
    public boolean fun(int i, int[] arr, int sum, Boolean[][] memo) {
        if (sum == 0) {
            return true;
        }
        if (sum < 0 || i == arr.length) {
            return false;
        }
        if (memo[i][sum] != null) {
            return memo[i][sum];
        }
     
        memo[i][sum] = fun(i + 1, arr, sum - arr[i], memo) || fun(i + 1, arr, sum, memo);
        return memo[i][sum];
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum = sum / 2;
        Boolean[][] memo = new Boolean[nums.length][sum + 1]; 
        return fun(0, nums, sum, memo);
    }
}