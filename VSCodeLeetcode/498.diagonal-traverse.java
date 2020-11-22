/*
 * @lc app=leetcode id=498 lang=java
 *
 * [498] Diagonal Traverse
 */

// @lc code=start
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
    
        if (matrix.length == 0)
            return new int[0];

        if (matrix.length == 1)
            return matrix[0];

        int M = matrix.length; // number of row
        int N = matrix[0].length; // number of column
        int[] result = new int[M*N];
        
        
        int index = 0;
        int upDown = -1;
        int leftRight = 1;

        int row = 0; // coordinate 
        int col = 0; // coordinate 

        // d: diagonal
        for (int d = 0; d < M+N-1; d++)
        {
            while (0 <= row && row <= M-1 && 0 <= col && col <= N-1)
            {
                result[index] = matrix[row][col];
                row += upDown;
                col += leftRight;
                index++;
            }
            
            row -= upDown;
            col -= leftRight;
            
            // out of the border
            if (row == 0 && col < N-1)
                col++;
            else if (col == 0 && row < M-1)
                row++;
            else if (col == N-1)
                row++;
            else if (row == M-1)
                col++;           

            upDown *= -1;
            leftRight *= -1;
        }
        return result;
    }
}
// @lc code=end

