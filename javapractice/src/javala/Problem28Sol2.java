package javala;

class Problem28Sol2 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;

        boolean isMatched = true;

        for (int i = 0; i <= haystack.length()-needle.length(); i++)
        {
            isMatched = true;

            for (int j = 0; j < needle.length(); j++)
            {
                if (needle.charAt(j) != haystack.charAt(i+j))
                {
                    isMatched = false;
                    break;
                }
            }
            if (isMatched)
                return i;
        }
        return -1;
    }
}