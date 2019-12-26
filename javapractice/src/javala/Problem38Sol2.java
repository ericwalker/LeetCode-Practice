class Solution {
    public String countAndSay(int n) {

        // 1.     1
        // 2.     11
        // 3.     21
        // 4.     1211
        // 5.     111221

        String resultStr = "1";

        // create list for n == i
        for (int i = 2; i <= n; i++)
            resultStr = findNextString(resultStr);

        return resultStr;
    }

    public String findNextString(String str)
    {
        char curNum = '0';
        int counter = 0;

        char[] charArr = str.toCharArray();
        StringBuffer newStrBuf = new StringBuffer();

        for (char val: charArr) // list == {1,2,1,1}
        {
            // val is the first item
            if (curNum == '0')
            {
                curNum = val;
                counter = 1;
            }

            // same item 
            else if (curNum == val)
                counter++;

                // new item
            else
            {
                newStrBuf.append(counter).append(curNum);

                // reset the counter and set new val as new curNum
                curNum = val;
                counter = 1;
            }
        }
        newStrBuf.append(counter).append(curNum);

        return newStrBuf.toString();
    }

}