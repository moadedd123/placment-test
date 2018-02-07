package com.sqli.formation.writeString;

public class WriteString {

	public String writeString() {
		String lignes[] = new String[3];
		lignes[0] = "|O|O|X|\n";
		lignes[1] = "|O|X|X|\n";
		lignes[2] = "|X| |O|";
		String result = "";
		for (int i = 0; i < 3; i++) {
			result +=lignes[i];
		}
		return result;
	}
}
