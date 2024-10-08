package Day1;

// Sum of pairs
// We call an array of integers X of size N good if it can be partitioned into 2 arrays of size n/2, say p1[ ] and p2[ ], such that p1[0] + p2[0] = p1[1] + p2[1] = p1[2] + p2[2] = ... . Given an array Y, determine the size of its largest subset which is a good array.

// Input
// The first line contains the integer N (≤ 100).

// The next line contains N space separated integers, which are the elements of the array X.

// Output
// One number which is the size of the greatest subset as mentioned in the problem statement.

// Example
// Input:
// 6

// 1 4 2 3 8 10 
// Output:
// 4
// Explanation:
// The array {1,4,2,3} is good, since you can form p1[] = {1,2} and p2[] = {4,3}. (satisfying 1 + 4 = 2 + 3)


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Goodpairs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[]x=new int[N];
        for(int i=0;i<N;i++){
            x[i]=scanner.nextInt();
        }
        Map<Integer,Integer> pairSumCount=new HashMap<>();
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int sum=x[i]+x[j];
                pairSumCount.put(sum,pairSumCount.getOrDefault(sum, 0)+1);
            }
        }
        int maxSubsetSize=0;
        for(int count:pairSumCount.values()){
            maxSubsetSize=Math.max(maxSubsetSize,count*2);
        }
        System.err.println(maxSubsetSize);
    }
    
}
