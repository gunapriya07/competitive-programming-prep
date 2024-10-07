// Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

// Example 1:

// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1
// Example 2:

// Input: grid = [
//   ["1","1","0","0","0"],
//   ["1","1","0","0","0"],
//   ["0","0","1","0","0"],
//   ["0","0","0","1","1"]
// ]
// Output: 3

class Solution {
    boolean[][] flag;
    public int numIslands(char[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        int n=0;
        flag = new boolean[height][width];
        for(int i=0; i<height; i++){
            for(int j=0; j<width;j++){
                if(grid[i][j] == '1' && !flag[i][j]){
                    flag[i][j] = true;
                    ++n;
                    inrowchecker(grid,i,j);
                    incolumnchecker(grid,i,j);
                }
            }
        }
        return n;
    }
    private void inrowchecker(char[][] grid, int row, int cols){
        for(int i=cols-1; i>-1; i--){
            if(grid[row][i] == '1' && !flag[row][i]){
                flag[row][i] = true;
                incolumnchecker(grid,row,i);
            }
            else break;
        }

        for(int i=cols+1; i<grid[0].length; i++){
            if(grid[row][i] == '1' && !flag[row][i]){
                flag[row][i] = true;
                incolumnchecker(grid,row,i);
            }
            else break;
        }
        return;
    }

      private void incolumnchecker(char[][] grid, int row, int cols){
        for(int i=row-1; i>-1; i--){
            if(grid[i][cols] == '1' && !flag[i][cols]){
                flag[i][cols] = true;
                inrowchecker(grid,i,cols);
            }
            else break;
        }

        for(int i=row+1; i<grid.length; i++){
            if(grid[i][cols] == '1' && !flag[i][cols]){
                flag[i][cols] = true;
                inrowchecker(grid,i,cols);
            }
            else break;
        }
        return;
    }
}