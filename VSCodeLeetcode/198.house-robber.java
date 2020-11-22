/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {

        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        int[] maxRob = new int[nums.length];
        maxRob[0] = nums[0];
        maxRob[1] = Math.max(nums[0], nums[1]);
       
        for (int i = 2; i < nums.length; i++) {
            maxRob[i] = Math.max(maxRob[i-2]+nums[i], maxRob[i-1]);
        }
        return maxRob[nums.length-1];
    }
}
// @lc code=end

