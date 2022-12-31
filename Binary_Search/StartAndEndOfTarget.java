package Binary_Search;

//34. Find First and Last Position of Element in Sorted Array
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;

public class StartAndEndOfTarget {

	public static void main(String[] args) {
		int[] arr= {5,7,7,8,8,10};
		int target=8;
		System.out.println(Arrays.toString(searchRange(arr, target)));

	}
	static int[] searchRange(int[] nums, int target) {
        
	       int[] ans= {-1,-1};
	        int s=search(nums,target,true);
	        int e=search(nums,target,false);
	        ans[0]=s;
	        ans[1]=e;
	       return ans; 
	    }
	
	static int search(int[] arr,int target,boolean findStartIndex) {
		
		int start=0;
		int end=arr.length-1;
		int index=-1;
		while (start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>target)
				end=mid-1;
			else if(arr[mid]<target)
				start=mid+1;
			else {
				index=mid;
				if(findStartIndex) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
		}
		return index;
	}


}
