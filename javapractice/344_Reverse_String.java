package javapractice;

import java.util.*;

public class Solution {
	public void reverseString(char[] s) {

		// int left = 0;
		int right = s.length-1;
		char temp;

		for (int left=0;left<s.length/2;left++)
		{
			temp = s[left];
			s[left] = s[right];ffL
			s[right] = temp;
			right -= 1;
		}
	}
}