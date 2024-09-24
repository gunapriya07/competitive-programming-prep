// https://leetcode.com/problems/house-robber/description/

// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

// Example 1:

// Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.
// Example 2:

// Input: nums = [2,7,9,3,1]
// Output: 12
// Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
// Total amount you can rob = 2 + 9 + 1 = 12.
 

// Constraints:

// 1 <= nums.length <= 100
// 0 <= nums[i] <= 400

//Approach - 1 Memorization

class Solution {
    public int rob(int[] num) {
        
        int n = num.length;
        if(n==0) return 0;
        int [] dp = new int [n];
        Arrays.fill(dp,-1);
        return solve(n-1,num,dp);
    }
    public int solve(int n, int [] num, int [] dp){
        
        if(n==0) return num[n];
        if(n<0) return 0;
        
        if(dp[n]!=-1) return dp[n];

        int pick = solve(n-2,num,dp)+ num[n];
        int nopick = solve(n-1,num,dp);

        return dp[n]= Math.max(pick,nopick);
    }
}
