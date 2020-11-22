public class Solution {
    public int pivotIndex(int[] nums) {
        
        if (nums.length == 0)
            return -1;
        
        if (nums.length == 1)
            return 0;
        
        // nums.length >= 2
        int leftSum = 0;
        int rightSum = 0;
        int pivot = 0;
        
        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }
        
        
        if (leftSum == rightSum)
            return pivot;
        
        // nums.length >= 2
        for (int i = 1; i < nums.length; i++) {
            leftSum = leftSum + nums[i-1];
            rightSum = rightSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        
        return -1;
    }
}