package Sorting_Techniques;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {4, 1, 3,-10,100,999,210, -9, 7};
		insert(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void insert(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j >0; j--) {
				if(arr[j]<arr[j-1])
					swap(arr, j, j-1);
				else
					break;
			}
		}
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
