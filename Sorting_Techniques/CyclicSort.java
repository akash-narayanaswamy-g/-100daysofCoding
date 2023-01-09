package Sorting_Techniques;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		int[] arr= {4, 1, 3,2};
		CySort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void CySort(int[] arr) {
		int i=0;
		while (i<arr.length) {
			int correctindex=arr[i]-1;
			if(arr[i]!=arr[correctindex])
				swap(arr, i, correctindex);
			else
				i++;
		}
	}
	
	public static void swap(int[] arr,int i,int j) {
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}

}

