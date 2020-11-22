/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // Use DP
        int len = s.length();
        boolean[] dp = new boolean[len+1];
        dp[0] = true;
        
        for (int i = 1; i <= len; i++) {
            for (String word : wordDict) {
                int j = i - word.length();
                if (j >= 0 && dp[j] && s.substring(j, i).equals(word)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[len];
    }

    }
// @lc code=end

