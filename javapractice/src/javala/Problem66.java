class Solution {
    public int[] plusOne(int[] digits) {


        digits[digits.length-1] = digits[digits.length-1] + 1;
        int carry = 0;

        for (int i = digits.length-1; i >=0; i--)
        {
            digits[i] = digits[i] + carry;
            carry =  digits[i] / 10;
            digits[i] = digits[i] % 10;
        }

        if (carry == 0)
            return digits;

        int[] newResult = new int[digits.length+1];
        newResult[0] = 1;

//        The last part of code is only for the case that the whole input array is 9s.
//        For example : 99999-----> 100000
//        for (int i = 0; i < digits.length; i++)
//            newResult[i+1] = digits[i];

        return newResult;
    }
}