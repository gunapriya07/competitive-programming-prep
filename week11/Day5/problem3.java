// 3. Longest Consecutive Sequence

// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

class problem3 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int best =0;
        for(int n:set){
            if(!set.contains(n-1)){
                int m = n+1;
                while(set.contains(m))
                {
                    m++;
                }
                best = Math.max(best,m-n);
            }
        }
        return best;
    }
}
