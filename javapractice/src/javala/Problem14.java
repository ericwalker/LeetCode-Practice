package javala;

class Problem14 {
    public String longestCommonPrefix(String[] strs) {

        boolean finished = false;
        int preNo = 0;

        if (strs.length == 0)
            return "";

        while (!finished)
        {
            finished = helper(strs, preNo, finished);
            preNo++;
        }
        return strs[0].substring(0,preNo-1);
    }

    public boolean helper(String[] strs, int preNo, boolean finished)
    {
        if (preNo >= strs[0].length())
            return true;
        char pre = strs[0].charAt(preNo);

        for (int i=1;i<strs.length;i++)
        {
            if (preNo >= strs[i].length())
                return true;
            else if (strs[i].charAt(preNo) == pre)
                continue;
            else
                return true;
        }
        return false;
    }
}