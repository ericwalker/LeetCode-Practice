/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        // Bit manipulation
        // XOR
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        // missing =4∧(0∧0)∧(1∧1)∧(2∧3)∧(3∧4)
        //         =(4∧4)∧(0∧0)∧(1∧1)∧(3∧3)∧2
        //         =0∧0∧0∧0∧2
        //         =2
        
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }

        return missing;

    }
}
// @lc code=end

