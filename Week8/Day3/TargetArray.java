// You are given an integer array nums. You have an integer array arr of the same length with all values set to 0 initially. You also have the following modify function:


// You want to use the modify function to convert arr to nums using the minimum number of calls.

// Return the minimum number of function calls to make nums from arr.

// The test cases are generated so that the answer fits in a 32-bit signed integer.

 

// Example 1:

// Input: nums = [1,5]
// Output: 5
// Explanation: Increment by 1 (second element): [0, 0] to get [0, 1] (1 operation).
// Double all the elements: [0, 1] -> [0, 2] -> [0, 4] (2 operations).
// Increment by 1 (both elements)  [0, 4] -> [1, 4] -> [1, 5] (2 operations).
// Total of operations: 1 + 2 + 2 = 5.
// Example 2:

// Input: nums = [2,2]
// Output: 3
// Explanation: Increment by 1 (both elements) [0, 0] -> [0, 1] -> [1, 1] (2 operations).
// Double all the elements: [1, 1] -> [2, 2] (1 operation).
// Total of operations: 2 + 1 = 3.
// Example 3:

// Input: nums = [4,2,5]
// Output: 6
// Explanation: (initial)[0,0,0] -> [1,0,0] -> [1,0,1] -> [2,0,2] -> [2,1,2] -> [4,2,4] -> [4,2,5](nums).
 

// Constraints:

// 1 <= nums.length <= 105
// 0 <= nums[i] <= 109

class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;
        int max = 0;
        int maxEvenOperations = 0;    

        for(int i: nums) {
            
            if(i == 0) {
                continue;
            }

            /* for every i which is greater than 0 will require one operation to make it to 1 */ 
            operations++;

            /* Now, compute every odd and even operations required for i */

            int[] arr = countOddAndEvenOperation(i);
            
            /* Add only odd operation as it needs to be done via Option-1 given */
            operations += arr[1]; 

            /* identify max element */
            if(i > max) {
                max = i;
                maxEvenOperations = arr[0];
            }
        }

        /* Add even operation of only max element as it will cover all the elemets smaller to it in an array. 
        And will be done via Option-2 (given in the problem statement) */
        operations += maxEvenOperations;
        return  operations;
    }

    private int[] countOddAndEvenOperation(int n) {
        int evenCount = 0;
        int oddCount = 0;
        
        while(n > 1) {
            if(n % 2 != 0) {
                oddCount++;
            }
            n /= 2;
            evenCount++;
        }

        return new int[] {evenCount, oddCount} ;
    }
}