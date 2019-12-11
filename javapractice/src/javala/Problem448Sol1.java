package javala;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Problem448Sol1 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] tempArray = new int[nums.length+1];
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++)
        {
            tempArray[nums[i]] = nums[i];
        }
        
        for (int i = 1; i < tempArray.length; i++)
        {
            if (tempArray[i] == 0)
                result.add(i);
        }
        
        return result;
            
    }
}