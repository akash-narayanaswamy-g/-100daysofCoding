package Sorting_Techniques;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] arr= {4, 1, 3, 9, 7};
		cSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void cSort(int[] arr) {
		int[] count=new int[arr[maxIndex(arr,arr.length-1)]+1];
		
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		for (int j = 1; j < count.length; j++) {
			count[j]+=count[j-1];
		}
		
		
		int[] ans=new int[arr.length];
		for (int k = arr.length-1; k >=0; k--) {
			ans[--count[arr[k]]]=arr[k];
		}
		for (int i = 0; i < ans.length; i++) arr[i]=ans[i];
	}
	
	public static int maxIndex(int[] arr,int i) {
		int max=0;
		for (int j2 = 1; j2 <= i; j2++) {
			if(arr[max]<arr[j2])
				max=j2;
		}
		return max;
	}

}
