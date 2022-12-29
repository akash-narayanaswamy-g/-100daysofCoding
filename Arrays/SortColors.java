package ArrayProblems;

//75. Sort Colors
//https://leetcode.com/problems/sort-colors/description/
//https://www.youtube.com/watch?v=oaVa-9wmpns

import java.util.*;

public class SortColors {

	public static void main(String[] args) {
		int[] a= {2,0,2,1,1,0};
		sortColors(a);
		System.out.println(Arrays.toString(a));

	}
	static void swap(int[] arr,int n,int n2) {
		int temp=arr[n];
		arr[n]=arr[n2];
		arr[n2]=temp;
	}
	
	static void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        for (int i = 0; i < nums.length; i++) {
			if(nums[mid]==0) {
				swap(nums,mid,low);
				low++;
				mid++;
			}
			else if(nums[mid]==1) {
				mid++;
			}
			else {
				swap(nums,mid,high);
				high--;

			}
				
		}
        
    }

}
