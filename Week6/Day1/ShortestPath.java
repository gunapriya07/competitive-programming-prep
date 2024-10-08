// You are given an m x n integer matrix grid where each cell is either 0 (empty) or 1 (obstacle). You can move up, down, left, or right from and to an empty cell in one step.

// Return the minimum number of steps to walk from the upper left corner (0, 0) to the lower right corner (m - 1, n - 1) given that you can eliminate at most k obstacles. If it is not possible to find such walk return -1.

 

// Example 1:


// Input: grid = [[0,0,0],[1,1,0],[0,0,0],[0,1,1],[0,0,0]], k = 1
// Output: 6
// Explanation: 
// The shortest path without eliminating any obstacle is 10.
// The shortest path with one obstacle elimination at position (3,2) is 6. Such path is (0,0) -> (0,1) -> (0,2) -> (1,2) -> (2,2) -> (3,2) -> (4,2).
// Example 2:


// Input: grid = [[0,1,1],[1,1,1],[1,0,0]], k = 1
// Output: -1
// Explanation: We need to eliminate at least two obstacles to find such a walk.
 

// Constraints:

// m == grid.length
// n == grid[i].length
// 1 <= m, n <= 40
// 1 <= k <= m * n
// grid[i][j] is either 0 or 1.
// grid[0][0] == grid[m - 1][n - 1] == 0

class Solution {
    public int shortestPath(int[][] grid, int k) {
        
        int m = grid.length, n = grid[0].length;
        boolean[][][] visited = new boolean[m][n][k + 1];
        
		Queue<int[]> Q = new LinkedList(); 
        Q.add(new int[]{0, 0, k});
		//0 index -> x coordinate
		//1 index -> y coordinate
		//2 index -> obstacle count
     
        int res = 0;
        
        while(Q.size() > 0){
            int size = Q.size();
			
            while(size-- > 0){
                
                int[] rem = Q.remove();
                int x = rem[0];
                int y = rem[1];
                int obs = rem[2];
                
                if(x == m - 1 && y == n - 1 && obs >= 0)   return res;     // reached end
                
                if(obs < 0 || visited[x][y][obs] == true)  continue;
                visited[x][y][obs] = true;
                
                // up
                if(x - 1 >= 0){
                    Q.add(new int[]{x - 1, y, obs - grid[x - 1][y]});
                }
    
                // down
                if(x + 1 < m){
                    Q.add(new int[]{x + 1, y, obs - grid[x + 1][y]});
                }
                
                // left
                if(y - 1 >= 0){
                    Q.add(new int[]{x , y - 1, obs - grid[x][y - 1]});
                }
                
                // right
                if(y + 1 < n){
                    Q.add(new int[]{x , y + 1, obs - grid[x][y + 1]});
                }
            }
            ++res;
        }
        return -1;
    }
}