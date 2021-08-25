//Sort using Collections

package week3.Day2Assignments;

import java.util.ArrayList.*;
import java.util.*;

public class Assign3Sort {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Aspire systems");
		list1.add("CTS");
		list1.add("Wipro");
		list1.add("HCL");
		
		System.out.println("Given Strings stored in a list : " + list1);
		
		Collections.sort(list1);
		
		System.out.print("Printing sorted List in Reverse Order : ");
		for(int i=list1.size()-1;i>=0;i--)
			System.out.print(list1.get(i) + " , ");
		//Aspire systems, cts, wipro, Hcl

		System.out.println("");
		System.out.println("Printing sorted List : "+list1);
	}

}
