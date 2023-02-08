package BitManipulation;

//1356. Sort Integers by The Number of 1 Bits
//https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/

import java.util.Arrays;

public class SortIntegersbyTheNumberOf1Bits {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(sortByBits(arr)));

	}
	
	public static int[] sortByBits(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]+=setCount(arr[i])*10001;
		}

        Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			arr[i]%=10001;
		}
		
		return arr;
    }

	private static void swap(int[] arr, int i, int j) {
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
		
	}

	public static int setCount(int n) {
		int c=0;
		while(n>0) {
			if((n&1)==1)
				c++;
			n=n>>1;
		}
		return c;
    }
}
