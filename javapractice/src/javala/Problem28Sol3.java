// use KMP algorithm to solve "Longest Common Substring" question

class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0)
            return 0;

        int cur = 0;
        int[] LCSArr = helper(needle);

        for (int i = 0; i < haystack.length(); i++)
        {
            if (haystack.charAt(i) == needle.charAt(cur))
            {
                if (cur == (needle.length() - 1))
                    return i - needle.length() + 1;
                cur++;
            }
            else
            {
                while (cur > 0)
                {
                    cur = LCSArr[cur-1];
                    if (haystack.charAt(i) == needle.charAt(cur))
                    {
                        cur++;
                        break;
                    }
                }
            }
        }
        return -1;
    }

    public int[] helper(String str)
    {
        int[] LCSArr = new int[str.length()];
        int cur = 0;

        for (int i = 1; i < str.length(); i++)
        {
            if (str.charAt(i) == str.charAt(cur))
            {
                cur++;
                LCSArr[i] = cur;
            }
            else
            {
                while (cur > 0)
                {
                    cur = LCSArr[cur-1];
                    if (str.charAt(i) == str.charAt(cur))
                    {
                        cur++;
                        LCSArr[i] = cur;
                        break;
                    }
                }
            }
        }
        return LCSArr;
    }
}