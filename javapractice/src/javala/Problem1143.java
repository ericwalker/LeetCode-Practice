class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        char[] text1Arr = text1.toCharArray();
        char[] text2Arr = text2.toCharArray();

        int lengthOfText1 = text1.length();
        int lengthOfText2 = text2.length();

        int[][] lcsTable = new int[lengthOfText1+1][lengthOfText2+1];

        for (int i = 1; i <= lengthOfText1; i++)
        {

            for (int j = 1; j <= lengthOfText2; j++)
            {
                if (text1Arr[i-1] == text2Arr[j-1])
                    lcsTable[i][j] = 1 + lcsTable[i-1][j-1];
                else
                    lcsTable[i][j] = Math.max(lcsTable[i-1][j], lcsTable[i][j-1]);
            }
        }

        return lcsTable[lengthOfText1][lengthOfText2];
    }
}