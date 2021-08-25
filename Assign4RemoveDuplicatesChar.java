package week3.Day2Assignments;

import java.util.*;
import java.util.Collections.*;

public class Assign4RemoveDuplicatesChar {
	
	public static void removeDuplicateMethod1(String str1) {
		int count=0;
		char[] charArray = str1.toCharArray();
		Set<String> charSet = new LinkedHashSet<String>();
		Set<String> dupcharSet = new LinkedHashSet<String>();
		
		for(int i=0;i<charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				//if(charArray[i]==charArray[j] || charArray[i]==Character.toLowerCase(charArray[j]) || charArray[i]==Character.toUpperCase(charArray[j]))					
				if(charArray[i]==charArray[j])	
				count++;
			}
			charSet.add(Character.toString(charArray[i]));
			if(count>=1)
				dupcharSet.add(Character.toString(charArray[i]));
			count=0;
		}	
		System.out.println("***************Method#1******************");
		System.out.print("Given String without Duplicate characters : " );
		for(String eachchar: charSet)
			System.out.print(eachchar);
		System.out.println("\n");
		System.out.println("Duplicate Characters in given String 'PayPal India' : " + dupcharSet);
	
		//Removing duplicate element from charSet
		charSet.removeAll(dupcharSet);
	
		//Removing blankspace or null element from charSet
		System.out.print("Unique characters in the givenString without duplicated char & its duplicates/blankspaces are : ");
		for(String eachchar: charSet)
			if(eachchar.isBlank() || eachchar.isEmpty())
				;
			else
				System.out.print(eachchar);
		System.out.println("\n");
	}

	public static void removeDuplicateMethod2(String str1) {
		//Another Method to remove duplicate characters alone
		char[] charArray = str1.toCharArray();
		Set<String> charSet = new LinkedHashSet<String>();
		for(char char1 : charArray) 
			charSet.add(Character.toString(char1));
		System.out.println("***************Method#2******************");
		System.out.print("Given String without Duplicate characters : ");
		for(String char1 : charSet)
			System.out.print(char1);
	}
	
	public static void main(String[] args) {
		String str="PayPal India";
		System.out.println("Given String : " + str);
		removeDuplicateMethod1(str);
		removeDuplicateMethod2(str);
		
	}

}
