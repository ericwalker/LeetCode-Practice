/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ansList = new ArrayList<Integer>();

        if (matrix.length == 0)
            return ansList;

        int rowBound = matrix.length;
        int colBound = matrix[0].length;

        int curR = 0, curC = 0, di = 0;
        boolean[][] seen = new boolean[rowBound][colBound];

        int[] dr = {0, 1, 0 ,-1};
        int[] dc = {1, 0, -1, 0};

        for (int i = 0; i < rowBound*colBound; i++) {        
            ansList.add(matrix[curR][curC]);
            seen[curR][curC] = true;
            
            // candidate next position is (cr, cc)
            int cr = curR + dr[di];
            int cc = curC + dc[di];

            // the candidate is still inside the border, and still not seen.
            if (cr < rowBound && cr >= 0 && cc < colBound && cc >= 0 && seen[cr][cc] == false) {
                curR = cr;
                curC = cc;
            }
            else {
                di = (di+1) % 4;
                curR += dr[di];
                curC += dc[di];
            }
        }

        return ansList;    
    }
}
// @lc code=end

