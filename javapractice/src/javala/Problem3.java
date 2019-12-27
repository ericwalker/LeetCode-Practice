class Solution {
    public int lengthOfLongestSubstring(String s) {


        if (s.isEmpty())
            return 0;

        // int[] arr = Integer.valueOf(s);
        int resultStart = 0;
        int resultEnd = 0;
        int curStart = 0;
        int curEnd = 0;

        // key: the value of the element
        // value: the index of the element
        Map<Character, Integer> substringElementMap = new HashMap<>();

        substringElementMap.put(s.charAt(0), 0);

        for (int i = 1; i < s.length(); i++)
        {
            if (substringElementMap.containsKey(s.charAt(i)))
            {
                if ((i - 1 - curStart) > (resultEnd - resultStart))
                {
                    resultStart = curStart;
                    resultEnd = i-1;
                }

                // else, the longest substring doesn't change, so do nothing.
                int newCurStart = substringElementMap.get(s.charAt(i)) + 1;

                // remove the entry which is not substring element anymore.
                for (int mapIndex = curStart; mapIndex < newCurStart; mapIndex++)
                    substringElementMap.remove(s.charAt(mapIndex));

                curStart = newCurStart;
            }

            substringElementMap.put(s.charAt(i), i);
            curEnd = i;
        }

        if ((curEnd - curStart) > (resultEnd - resultStart))
            return curEnd - curStart + 1;

        return  resultEnd - resultStart + 1;
    }
}