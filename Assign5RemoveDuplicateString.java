package week3.Day2Assignments;

import java.util.*;


public class Assign5RemoveDuplicateString {

	public static void main(String[] args) {
		String givenString = "We learn java basics as part of java sessions as in java week1";
		
		//*************Using Set***************************
		Set<String> uniqueStr = new LinkedHashSet<String>();
		
		String[] words=givenString.split(" ");
		
		for(String word : words)
			uniqueStr.add(word);
				
		System.out.println("Given String : "+givenString);
				
		System.out.print("Removing duplicates from the given String using 'Set' : "); 
		for(String eachword : uniqueStr)
			System.out.print(eachword +" ");
		
		System.out.println("\n");
		
		//****************Using List***********************
		List<String> list1 = new ArrayList<String>(Arrays.asList(words));
		List<String> dupList = new ArrayList<String>();
		List<Integer> lastindexes = new ArrayList<Integer>();
		int firstIndex=0;String word1; Integer lastIndex;
		
		System.out.println("*************Removing duplicates from the given String using 'List'*********");
		for(int i=0;i<list1.size();i++) {
			word1=list1.get(i);
			if (list1.contains(word1)) {
				lastIndex=list1.lastIndexOf(word1);
				firstIndex=list1.indexOf(word1);
				if(lastIndex!=firstIndex) { //to check the duplicate word
					if(lastindexes.contains(lastIndex)) { //to handle if the same word duplicated multiple times
						if((list1.subList(i+1, list1.size())).contains(word1))
							lastindexes.add(i);
					}	
					else
						lastindexes.add(lastIndex);	
					if(!(dupList.contains(word1)))
						dupList.add(word1);
				}
				
			}
		
		}
		//To remove duplicates in the given String
		System.out.println("Index of duplicate elements : " + lastindexes);
		for (int j : lastindexes)
			list1.remove(j);
		
		System.out.print("After removing duplicates from the given String : " );
		for (String s : list1)
			System.out.print(s + " ");
		
		System.out.print("\n");
		System.out.print("Duplicated Words : " + dupList+"\n");
		
		//To remove original word which had duplicates
		list1.removeAll(dupList);
		System.out.print("After removing duplcated word and its duplicates from the given String : ");
		for (String s : list1)
			System.out.print(s + " ");
		
	}	

}
