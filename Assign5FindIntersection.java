//To find the common elements between 2 Arrays using sets and print them 
package week3.Day2Assignments;

import java.util.*;
import java.util.ArrayList.*;
import java.util.Collections;


public class Assign5FindIntersection {

	public static void main(String[] args) {
		
		Integer[] array1 = {3,2,11,4,6,9,7,18}, array2 = {1,18,2,8,4,9,7};
		
		//Using List
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(array1));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(array2));
		System.out.println("********Intersection using List***********");
		System.out.println("Numbers List1 : "+list1);
		System.out.println("Numbers List2 : "+list2);
		list1.retainAll(list2);
		System.out.println("Interscetion of Elements between above 2 given Arrays : " + list1);		
		
		//Using Set
		Set<Integer> numset1 = new HashSet<Integer>();
		for(int n1 : array1)
			numset1.add(n1);
		
		Set<Integer> numset2 = new HashSet<Integer>();
		for(int n2 : array2)
			numset2.add(n2);
		System.out.println("********Intersection using Set***********");
		System.out.println("Numbers in first set : "+numset1);
		System.out.println("Numbers in second set : "+numset2);
		
		numset1.retainAll(numset2);
		System.out.println("Interscetion of Elements between above 2 given Arrays : " + numset1);
	}

}
