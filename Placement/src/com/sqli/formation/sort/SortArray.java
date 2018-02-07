package com.sqli.formation.sort;

public class SortArray {

	public void sortArray(int[] array) {
		int temp = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = i; j < array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}
	}
}
