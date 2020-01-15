class Solution {
    public List<String> letterCombinations(String digits) {

        HashMap<Character, String> digitMap = new HashMap<Character, String>();
        digitMap.put('2', "abc");
        digitMap.put('3', "def");
        digitMap.put('4', "ghi");
        digitMap.put('5', "jkl");
        digitMap.put('6', "mno");
        digitMap.put('7', "pqrs");
        digitMap.put('8', "tuv");
        digitMap.put('9', "wxyz");

        List<String> resultList = new ArrayList<String>();

        if (digits.length() == 0)
            return resultList;

        // Input the first character first
        String letters = digitMap.get(digits.charAt(0));
        for (int i = 0; i < letters.length(); i++)
            resultList.add(letters.substring(i,i+1));

        for (int digitNo = 1; digitNo < digits.length(); digitNo++)
            resultList = helper(resultList, digitMap.get(digits.charAt(digitNo)));

        return resultList;
    }

    public List<String> helper(List<String> origList, String letters)
    {
        List<String> resultList = new ArrayList<String>();

        for (int i = 0; i < origList.size(); i++)
            for (int j = 0; j < letters.length(); j++)
                resultList.add(origList.get(i) + letters.substring(j,j+1));

        return resultList;
    }
}