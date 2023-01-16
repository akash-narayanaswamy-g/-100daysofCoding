package Recursion;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		selects(arr,arr.length-5,0,arr[0]);
		System.out.println(Arrays.toString(arr));
	}

	private static void selects(int[] arr, int length, int j,int max) {
		if(length==0)return;
		if(length>j) {
			if(arr[max]<arr[j]) {
				selects(arr, length, j+1, j);
			}
			else
				selects(arr, length, j+1, max);
		}
		else {
			arr[length-1]^=arr[max];
			arr[max]^=arr[length-1];
			arr[length-1]^=arr[max];
		}
		selects(arr, length-1, 0, 0);
		
	}
}