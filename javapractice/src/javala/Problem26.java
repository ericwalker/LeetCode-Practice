package javala;

class Problem26 {
    public int removeDuplicates(int[] nums) {
        int curIndex = 0;

        if (nums.length == 1)
            return curIndex+1;

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == nums[curIndex])
                continue;

            nums[++curIndex] = nums[i];
        }
        return curIndex+1;
    }
}