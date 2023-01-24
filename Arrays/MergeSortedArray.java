package ArrayProblems;

//88. Merge Sorted Array
//https://leetcode.com/problems/merge-sorted-array/
import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int nums1[] = {1,2,3,0,0,0};int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));

	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int arr[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n) {
        	if(nums1[i]<=nums2[j])
        		arr[k++]=nums1[i++];
        	else
        		arr[k++]=nums2[j++];
        }
        
        while(i<m)
        	arr[k++]=nums1[i++];
        while(j<n)
        	arr[k++]=nums2[j++];
        
        for (int k2 = 0; k2 < arr.length; k2++) {
			nums1[k2]=arr[k2];
		}
    }

}
