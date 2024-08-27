// https://leetcode.com/problems/maximum-length-of-repeated-subarray/description/

// Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in both arrays.

 

// Example 1:

// Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
// Output: 3
// Explanation: The repeated subarray with maximum length is [3,2,1].
// Example 2:

// Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
// Output: 5
// Explanation: The repeated subarray with maximum length is [0,0,0,0,0].
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 100


class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;
        int ans=0;
        int dp[][]= new int[n+1][m+1];
        
        for(int i=1;i<=n;i++)
            for(int j=1;j<=m;j++){
                
                if(nums1[i-1]==nums2[j-1] ){
                    dp[i][j]= 1+ dp[i-1][j-1];
                    ans=Math.max (ans,dp[i][j] );
                } 
                else dp[i][j]=0;
            }
        return ans;
        
    }
}