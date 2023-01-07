package Sorting_Techniques;

//Selection Sort
//https://practice.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {4, 1, 3, 9, 7};
		select(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void select(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int end=arr.length-i-1;
			int maxindex=maxIndex(arr, end);
			swap(arr, end, maxindex);
		}
		
	}
	
	public static int maxIndex(int[] arr,int i) {
		int max=0;
		for (int j2 = 1; j2 <= i; j2++) {
			if(arr[max]<arr[j2])
				max=j2;
		}
		return max;
	}
	
	
	public static void swap(int[] arr,int i,int j) {
//		arr[i]^=arr[j];
//		arr[j]^=arr[i];
//		arr[i]^=arr[j];
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}

}
