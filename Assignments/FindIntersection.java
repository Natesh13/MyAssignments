package week3.day3.Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
	
		
		//a) Declare An Array for {3,2,11,4,6,7};	
		
		int[] a={3,2,11,4,6,7};
		
		//b) Declare another Array for {1,2,8,4,9,7};
		int[] b={1,2,8,4,9,7};
		
		int ArraysizeA = a.length;
		int ArraysizeB = b.length;
		
		//c) create a two empty Lists - list1 & list2
		
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		
		// Declare for loop iterator from 0 to array a.length and add into list1
		
		for (int i = 0; i < ArraysizeA ; i++) {
			list1.add(a[i]);
		}
		int size1 = list1.size();
		//System.out.println(list1);
		
		for (int j = 0; j < ArraysizeB; j++) {
			list2.add(b[j]);
			}
		int size2 = list2.size();
		//System.out.println(list2);
		
		//e) Compare Both list1 & list2 using a nested for loop
		
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				
				if(list1.get(i)==list2.get(j))
				{
					System.out.println("Matching number :"+list1.get(i));
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
