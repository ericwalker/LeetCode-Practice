// 136. Single Number
package javala;

// we use bitwise XOR

// N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
// = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
// = 0 ^ 0 ^ ..........^ 0 ^ N
// = N

class Problem136 {
    public int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        return helper(nums);
    }

    public int helper (int[] nums)
    {
        int N = nums[0];
        for (int i = 1; i<nums.length;i++)
        {
            N ^= nums[i];
        }
        return N;
    }
}