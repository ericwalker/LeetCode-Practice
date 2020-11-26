/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {

        // Use HashSet (Brute force method)
        // Time Complexity: O(n)
        // Space Complexity: O(n)

        Set<Integer> numSet = new HashSet<Integer>();

        for (int num: nums) {
            numSet.add(num);
        }

        int expectedNumCount = nums.length;
        for (int i = 0; i <= expectedNumCount; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

