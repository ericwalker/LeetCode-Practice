// use dp

class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int twoStepsBefore = cost[0];
        int oneStepBefore = cost[1];
        int cur = 0;

        for (int i = 2; i < cost.length; i++)
        {
            cur = Math.min(twoStepsBefore, oneStepBefore) + cost[i];

            twoStepsBefore = oneStepBefore;
            oneStepBefore = cur;
        }

        return Math.min(twoStepsBefore, oneStepBefore);
    }
}