package com.sqli.formation.writeTriangle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WriteTriangle {

	public static void main(String[] args) {
		int ligneNumber = 9;
		List<Integer> currentLigne = new ArrayList<>();
		List<Integer> previousLigne = new ArrayList<>();
		currentLigne.add(1);
		previousLigne.add(1);
		previousLigne.add(0);
		for (int i = 0; i < ligneNumber; i++) {
			for (int j = 0; j < currentLigne.size(); j++) {
				System.out.print(currentLigne.get(i) + " ");
			}
			currentLigne = new ArrayList<>();
			for (int j = 0; j < previousLigne.size(); j++) {
				currentLigne.add(1);
			}
		}
		
	}
}
