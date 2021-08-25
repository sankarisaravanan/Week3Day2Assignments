package week3.Day2Assignments;

import java.util.Arrays;
import java.util.*;
import java.util.TreeSet;

public class Assign5FindLargestMissingDuplicates {
	
	public static void secondLargest() {
		
		Integer[] data = {3,2,11,4,6,7};
				
		//Using List
		List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(data));
		System.out.println("Given List of Numbers : " + dataList);
		Collections.sort(dataList);
		System.out.println("***************Identifying Second Largest using List**************");
		System.out.println("Second Largest number in the given List : "+dataList.get(dataList.size()-2));
		
		//Using Set
		System.out.println("***************Identifying Second Largest using Set**************");
		TreeSet<Integer> dataSet = new TreeSet<Integer>();
		for(int i : data)
			dataSet.add(i);
		
		//System.out.println("Largest number in the given set of numbers : "+dataSet.last());
		dataSet.remove(dataSet.last());
		System.out.println("Second Largest number in the given set of numbers : "+dataSet.last());
		
	}

	public static void missingElements() {
		Integer[] arr = {1,2,3,4,7,6,8,11};
		
		//Using List
		List<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> newList = new ArrayList<Integer>();
		System.out.println("Given List of Numbers : " + arrList);
		Collections.sort(arrList);
		int maxnumber = arrList.get(arrList.size()-1);
		for (int i=1; i<=maxnumber; i++)
			newList.add(i);
		newList.removeAll(arrList);
		System.out.println("Identified Missing numbers using List : " + newList);
		
		//Using Set
		TreeSet<Integer> arrSet = new TreeSet<Integer>();
		TreeSet<Integer> newSet = new TreeSet<Integer>();
		for(int n : arr)
			arrSet.add(n);
		
		int lastnum = arrSet.last();
		
		for (int i=1; i<=lastnum; i++)
			newSet.add(i);
		newSet.removeAll(arrSet);
		System.out.println("Identified Missing numbers using Set : " + newSet);
		
	}
	
	public static void printDuplicateElements() {
		Integer[] arr1 = {14,12,13,11,15,14,18,16,17,19,18,17,20,17};
		
		//Using List
		List<Integer> arrLists = new ArrayList<Integer>(Arrays.asList(arr1));
		System.out.print("Given Set of Numbers : " + arrLists+"\n");
		
		Collections.sort(arrLists);
		//System.out.println(arrLists+"\n");
		System.out.print("Identified Duplicate numbers in the given Array using List : ");
		for(int i=0; i<arrLists.size()-1; i++) {
			if(arrLists.get(i)==arrLists.get(i+1))
				System.out.print(arrLists.get(i+1)+", ");
		}
		
		//Using Set
		TreeSet<Integer> arrSet1 = new TreeSet<Integer>();
		System.out.print("\n Identified Duplicate Numbers in the given Set of numbers using Set : ");
		for(int num : arr1)
			if(! arrSet1.add(num))
				System.out.print(num + ",");
		
	}
	
	public static void main(String[] args) {
		System.out.println("\n ==========SECOND LARGEST==============");
		secondLargest();
		System.out.println("\n ==========MISSING NUMBERS==============");
		missingElements();
		System.out.println("\n ==========DUPLICATE NUMBERS==============");
		printDuplicateElements();
	}

}
