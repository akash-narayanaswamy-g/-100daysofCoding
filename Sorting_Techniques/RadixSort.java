package Sorting_Techniques;

import java.util.*;

public class RadixSort {

	public static void main(String[] args) {
		int[] arr= {4, 1, 3,-10,100,999,210, -9, 7};
		RadixSort1(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	//sorting based on number of digits
	static void RadixSort1(int[] arr) {
		
		//checking for negative numbers
		boolean isnegative=false;
		for (int n : arr) {
			if(n<0) {
				isnegative=true;
				break;
			}
		}		
		
		int min=0;
		if(isnegative) {
			for (int i = 0; i < arr.length; i++) {
				if(min>arr[i])
					min=arr[i];
			}
			for (int j = 0; j < arr.length; j++) {
				arr[j]-=min;
			}			
		}
		
		//finding maximum number ,so that we can know the maximum number of digits
		int max=Arrays.stream(arr).max().getAsInt();
		for (int i = 1; max/i > 0; i++) {
			cSort(arr, i);
		}
		
		if(isnegative) {
			for (int j = 0; j < arr.length; j++) {
				arr[j]+=min;
			}
		}
	}
	
	static void cSort(int[] arr,int place) {
		int[] count=new int[arr[maxIndex(arr,arr.length-1)]+1];
		
		for (int i = 0; i < arr.length; i++) {
			count[(arr[i]/place)%10]++;
		}
		
		for (int j = 1; j < count.length; j++) {
			count[j]+=count[j-1];
		}
		
		
		int[] ans=new int[arr.length];
		for (int k = arr.length-1; k >=0; k--) {
			ans[--count[(arr[k]/place)%10]]=arr[k];
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
