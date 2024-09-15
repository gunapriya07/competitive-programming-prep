// https://leetcode.com/problems/course-schedule-ii/description/

// There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

// For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
// Return the ordering of courses you should take to finish all courses. If there are many valid answers, return any of them. If it is impossible to finish all courses, return an empty array.

 

// Example 1:

// Input: numCourses = 2, prerequisites = [[1,0]]
// Output: [0,1]
// Explanation: There are a total of 2 courses to take. To take course 1 you should have finished course 0. So the correct course order is [0,1].
// Example 2:

// Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
// Output: [0,2,1,3]
// Explanation: There are a total of 4 courses to take. To take course 3 you should have finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
// So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3].
// Example 3:

// Input: numCourses = 1, prerequisites = []
// Output: [0]
 

// Constraints:

// 1 <= numCourses <= 2000
// 0 <= prerequisites.length <= numCourses * (numCourses - 1)
// prerequisites[i].length == 2
// 0 <= ai, bi < numCourses
// ai != bi
// All the pairs [ai, bi] are distinct.

// Algo used Topological Sort
//Same as Course Schedule 1 , just here we are returining topo as an array
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         ArrayList<ArrayList<Integer>> adj= new ArrayList<>();// creating our adj list
        for(int i= 0; i< numCourses; i++){
            adj.add(new ArrayList<>());
        }

        int m = prerequisites.length; // converting the input prerequisites to adjList Step1
        for(int i=0;i<m;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int[] indegree= new int[numCourses]; // indegree array

        for(int i=0; i< numCourses; i++){   // marking the incoming edges (incoming edges) of node node Step2
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q= new LinkedList<>();   
        int[] topo= new int[numCourses];    // topo sort list
        int index=0;
        for(int i=0; i< numCourses; i++){   // // getting the nodes with 0 in-degree Step3
            if(indegree[i]== 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){    // doing our Topo sort BFS(Kahn's) Step4
            int node= q.poll();
            topo[index++]= node;
            for(int it: adj.get(node)){
                indegree[it]--; // removing the edges for the node nodes added in queue
                if(indegree[it] == 0){  // if at any point the node who are becoming 0 after decreaising then add in queue
                    q.add(it);
                }
            }
        }
        if(numCourses == index) return topo;
        int[] res= {};
        return res;
        
    }
}