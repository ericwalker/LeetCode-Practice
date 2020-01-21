class Solution {
    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int curA = a.length() - 1;
        int curB = b.length() - 1;

        while (curA >= 0 || curB >= 0)
        {
            int sum = carry;
            if (curA >= 0)
            {
                sum = sum + a.charAt(curA)-'0';
                curA--;
            }
            if (curB >= 0)
            {
                sum = sum + b.charAt(curB)-'0';
                curB--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        if (carry == 1)
            sb.append(carry);

        return sb.reverse().toString();
    }
}