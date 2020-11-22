/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> resultList = new ArrayList<String>();
        
        findNewItem(resultList, "", 0, 0, n);
        return resultList;
    }

    public void findNewItem(List<String> resultList, String curItem,int open, int close, int max)
    {
        if (curItem.length() == max * 2)
        {
            resultList.add(curItem);    
            return;
        }
        
        if (open < max)
            findNewItem(resultList, curItem + "(", open+1, close, max);
        if (close < open)
            findNewItem(resultList, curItem + ")", open, close+1, max);
    }
}
// @lc code=end

