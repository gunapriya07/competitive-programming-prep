// Course Schedule

// There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

// For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
// Return true if you can finish all courses. Otherwise, return false.

class problem2 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();// creating our adj list
        for(int i= 0; i< numCourses; i++){
            adj.add(new ArrayList<>());
        }

        int m = prerequisites.length; // converting the input prerequisites to adjList Step1
        for(int i=0;i<m;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int[] indegree= new int[numCourses]; // indegree array

        for(int i=0; i< numCourses; i++){   // marking the incoming edges (incoming edges) of node node Step2
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q= new LinkedList<>();   
        ArrayList<Integer> topo= new ArrayList<>();    // topo sort list
        for(int i=0; i< numCourses; i++){   // // getting the nodes with 0 in-degree Step3
            if(indegree[i]== 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){    // doing our Topo sort BFS(Kahn's) Step4
            int node= q.poll();
            topo.add(node);
            for(int it: adj.get(node)){
                indegree[it]--; // removing the edges for the node nodes added in queue
                if(indegree[it] == 0){  // if at any point the node who are becoming 0 after decreaising then add in queue
                    q.add(it);
                }
            }
        }
        if(topo.size() == numCourses){  // if topo size is N then cycle is not present and input if DAG, else return false for cycle
            return true;
        }
        return false;
    }
}