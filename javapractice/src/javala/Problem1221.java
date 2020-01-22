class Solution {
    public int balancedStringSplit(String s) {

        int counter = 0, ans = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'L')
                counter++;
            if (s.charAt(i) == 'R')
                counter--;

            if (counter == 0)
                ans++;
        }

        return ans;
    }
}