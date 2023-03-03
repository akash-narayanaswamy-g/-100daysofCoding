package Binary_Search;

import java.util.Arrays;

//4. Median of Two Sorted Arrays
//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2}, nums2 = {3,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int ans[]=new int[nums1.length+nums2.length];
	        int i=0,j=0,k=0;
	        
	        while(i <nums1.length && j<nums2.length) {
	        	if(nums1[i]<nums2[j])
	        		ans[k++]=nums1[i++];
	        	else
	        		ans[k++]=nums2[j++];
	        }
	        
	        while(i <nums1.length ) {
	        	ans[k++]=nums1[i++];
	        }
	        
	        while(j<nums2.length) {
	        	ans[k++]=nums2[j++];
	        }
	        System.out.println(Arrays.toString(ans));
	        int mid=(int)(ans.length-1)/2;
	        if(ans.length%2==0)
	        	return (ans[mid]+ans[mid+1])*1.0/2;
	        else
	        	return ans[mid];
	        	
	    }

}
