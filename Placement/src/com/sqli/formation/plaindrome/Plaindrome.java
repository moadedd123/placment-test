package com.sqli.formation.plaindrome;

public class Plaindrome {


	public Plaindrome() {
		super();
	}
	
	public boolean isPlaindrome(String phrase){
		StringBuilder chaine = new StringBuilder(phrase);
		chaine.reverse();
		if(phrase.equals(chaine.toString())) {
			return true;
		}
		return false;
	}
}
