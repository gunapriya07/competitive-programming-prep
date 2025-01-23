//4. Kth Largest Element in an Array

// Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.


class problem4 {
    public int findKthLargest(int[] nums, int k) {
        int n= nums.length;
        PriorityQueue<Integer> minHeap= new PriorityQueue<>(); 
        for(int i=0; i< n; i++){
            minHeap.add(nums[i]);
            if(minHeap.size() > k){ 
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}