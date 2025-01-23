# 2. Count Square Submatrices with All Ones

# Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.

class Solution:
    def countSquares(self, A):
        if not A or not A[0]:
            return 0
        
        count = 0
        rows, cols = len(A), len(A[0])
        
       
        for i in range(rows):
            for j in range(cols):
                if A[i][j] == 1:
                  
                    if i > 0 and j > 0:
                       
                        A[i][j] = min(A[i - 1][j], A[i][j - 1], A[i - 1][j - 1]) + 1
                    
                    count += A[i][j]
        
        return count
