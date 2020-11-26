package com.interview;

import java.util.HashSet;
import java.util.Set;

public class UniqueString {

	public static void main(String[] args) {

		if(isStringUnique_withoutDS(args[0]))
			System.out.println("Unique String");
		else
			System.out.println("Not Unique");
	}
	
	
	static boolean isStringUnique(String str) {
		if(str!=null && str!="")
			return false;
		//string to char array
		char[] charArray = str.toCharArray();
		
		Set<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			set.add(charArray[i]);
		}
		
		if(set.size() < charArray.length)
			return false;
		return true;
	}
	
	
	static boolean isStringUnique_withoutDS(String str) {
		if(str!=null && str!="")
			return false;
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			String temp = str.substring(i+1);
			System.out.println(temp);
			if(temp.contains(charArray[i]+""))
				return false;
		}
		return true;
	}

}
