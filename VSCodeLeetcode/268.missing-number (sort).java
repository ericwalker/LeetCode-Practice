/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        // Sort nums first
        // Time complexity: O(nlgn)
        // Space complexity: O(n) or O(1)

        int n = nums.length;
        
        Arrays.sort(nums);
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != i)
                return i;
        }
        
        return n;
    }
}
// @lc code=end

