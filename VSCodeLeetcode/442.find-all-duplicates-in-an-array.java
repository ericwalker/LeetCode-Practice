/*
 * @lc app=leetcode id=442 lang=java
 *
 * [442] Find All Duplicates in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Solve it in linear time.
        // It's tricky.

        // When you see 3, then make index 2 negative.
        // When you see 3 again, then you'll find that index 2 is already negative.
        // That it's already seen.

        List<Integer> output_arr = new ArrayList();

        for (int i=0; i<=nums.length-1;i++) {
            
            int index = Math.abs(nums[i])-1;
            if (nums[index] > 0) {
                nums[index] *= -1;
            }
            else {
                output_arr.add(index+1);
            }   
        }

        return output_arr;
    }
}
// @lc code=end

