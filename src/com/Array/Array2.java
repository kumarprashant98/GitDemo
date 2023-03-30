/*Searching an element in array*/
package com.Array;
import java.util.*;
public class Array2 {

	
	public static void main(String[] args) {
		int A[]= {3,2,1,4,5,8,9};
		int key;
		
		System.out.println("Enter a Key");
		Scanner sc=new 	Scanner(System.in);
		key=sc.nextInt();
		for(int i=0;i<A.length;i++)
		{
			if(key==A[i])
			{
				System.out.println("Element found at :"+i);
				System.exit(0);
			}
		}
			System.out.println("Not Found");
			sc.close();
			
		
		
		
		// TODO Auto-generated method stub

	}

}
