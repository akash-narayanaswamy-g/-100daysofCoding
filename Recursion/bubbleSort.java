package Recursion;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		bubble(arr,arr.length-1,0);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubble(int[] arr, int length, int i) {
		if(length==0)return;
		if(length>i) {;
			if(arr[i]>arr[i+1]) {
				arr[i]^=arr[i+1];
				arr[i+1]^=arr[i];
				arr[i]^=arr[i+1];
			}
			bubble(arr, length, i+1);
		}
		else {
			bubble(arr, length-1, 0);
		}
		
	}

}
