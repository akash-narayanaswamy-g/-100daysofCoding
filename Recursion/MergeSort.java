package Recursion;

import java.util.*;
public class MergeSort {

	public static void main(String[] args) {
		int[] arr= {5,4,79,0,-1,3,2,1};
		System.out.println(Arrays.toString(mSort(arr)));

	}
	
	public static int[] mSort(int[] arr) {
		if(arr.length==1)return arr;
		int mid=arr.length/2;
		
		int[] left=mSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right=mSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merger(left,right);
	}

	private static int[] merger(int[] left, int[] right) {
		int[] ans=new int[left.length+right.length];
		int l=0,r=0,k=0;
		while(l<left.length && r<right.length) {
			if(left[l]<right[r]) 
				ans[k++]=left[l++];
			else
				ans[k++]=right[r++];			
		}
		
		while(l<left.length) {
			ans[k++]=left[l++];
		}
		
		while(r<right.length) {
			ans[k++]=right[r++];
		}
		return ans;
	}

}
