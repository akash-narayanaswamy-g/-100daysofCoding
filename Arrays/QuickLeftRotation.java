package ArrayProblems;

//https://practice.geeksforgeeks.org/problems/quick-left-rotation3806/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=quick-left-rotation

import java.util.*;

public class QuickLeftRotation {

	public static void main(String[] args) {
		long arr[]={1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(arr));
		leftRotate(arr, 12, arr.length);
		
	}
	
	 static void leftRotate(long arr[], int k,int n)
	    {
		 k%=n;
		 Reverse(arr,0, k-1);
		 Reverse(arr, k, n-1);
		 Reverse(arr,0, n-1);	        	
		 System.out.println(Arrays.toString(arr));
	    }
	 
	 static void Reverse(long arr[], int s,int e)
	    {
	        	while(s<e)
	        		swap(arr, s++, e--);
	        		
	        		
	        
	    }
	 static void swap(long arr[], int k,int n)
	    {
	        	arr[k]^=arr[n];
	        	arr[n]^=arr[k];
	        	arr[k]^=arr[n];
	    }

}
