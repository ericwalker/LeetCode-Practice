/*
 * @lc app=leetcode id=747 lang=java
 *
 * [747] Largest Number At Least Twice of Others
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {
        
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[maxIndex] < nums[i])
                maxIndex = i; 
        }

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[maxIndex] < nums[i] * 2 && maxIndex != i)
                return -1;
        }

        return maxIndex;
    }
}
// @lc code=end

