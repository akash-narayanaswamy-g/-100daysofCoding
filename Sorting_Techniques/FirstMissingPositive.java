package Sorting_Techniques;

//41. First Missing Positive
//https://leetcode.com/problems/first-missing-positive/description/

import java.util.Arrays;

public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] nums1= {3,4,-1,1};
		System.out.println(firstMissingPositive(nums1));
		System.out.println(Arrays.toString(nums1));

	}
	
	public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length )
        {
            int correctIndex=nums[i]-1;
            if( nums[i]<nums.length && nums[i]>0 && nums[i]!=nums[correctIndex])
            	swap(nums,correctIndex,i);
            else
            	i++;
        }
        for (int i1 = 0; i1 < nums.length; i1++) {
			if(nums[i1]!=i1+1)
				return i1+1;
		}
		
        return nums.length+1;
	}
	
	public static void swap(int[] arr,int i,int j) {
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}


}
