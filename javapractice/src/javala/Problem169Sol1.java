package javala;

class Problem169Sol1 {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}