class Solution {
    public String toLowerCase(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            {
                sb.append((char)(str.charAt(i) + 32)); // use ASCII code
                // sb.append((char)(str.charAt(i) - 'A' + 'a'));
            }
            else
                sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}