package javala;

import java.util.*;

public class Problem344 {
	public void reverseString(char[] s) {

		// int left = 0;
		int right = s.length-1;

		for (int left=0;left<s.length/2;left++)
		{
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			right -= 1;
		}

		System.out.print(s);
	}
}