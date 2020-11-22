/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        
        int addOne = 0;
        for(int i = digits.length - 1; i >= 0; i--)
        {
            if (digits[i] < 9)
            {    
                digits[i]++;
                return digits;
            }
            else
            {
                addOne = 1;
                digits[i] = 0;
            }
        }
        
        // if code can come to here,
        // it means that the result should be 1000...0

        int[] result = new int[digits.length+1];

        result[0] = 1;
        return result;
    }
}
// @lc code=end

