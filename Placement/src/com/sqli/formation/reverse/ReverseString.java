package com.sqli.formation.reverse;

public class ReverseString {

	public String reverseString(String string) {
		char[] array = string.toCharArray();
		String result = "";
		for (int i = (array.length - 1); i >= 0; i--) {
			result += array[i];
		}
		return result;
	}
}
