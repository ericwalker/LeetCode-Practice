class Solution {
    public int climbStairs(int n) {
        // f(n) = f(n-1) + f(n-2)

        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int num1 = 1, num2 = 2;
        int[] stepTable = new int[n + 1];

        stepTable[1] = 1;
        stepTable[2] = 2;

        for (int i = 3; i <= n; i++)
            stepTable[i] = stepTable[i - 1] + stepTable[i - 2];
        return stepTable[n];
    }
}