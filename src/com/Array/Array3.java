/*Finding maximum element in array */
package com.Array;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {3,9,7,8,12,6,15,5,4,10};
	     int max=A[0];
	    for (int i=0;i<A.length;i++)
	    {
	    	if(A[i]>max)
	    	{
	    		max=A[i];
	    		
	    	}
	    }
	    System.out.println("Maximum element is :"+max);
	    

	}

}
