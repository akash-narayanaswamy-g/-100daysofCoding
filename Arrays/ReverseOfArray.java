package ArrayProblems;

import java.util.Arrays;

//2 pointer approach

public class ReverseOfArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,55,66,77,88,99};
		reverse(a);
		System.out.println(Arrays.toString(a));

	}
	
	static void reverse(int[] arr) {
		int start=0,end=arr.length-1;
		while(start<end) {
			swap(arr, start, end);
			start++;
			end--;
		}

	}
	
	static void swap(int[] arr,int start,int end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}

}
