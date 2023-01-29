package ArrayProblems;

//493. Reverse Pairs
//https://leetcode.com/problems/reverse-pairs/

public class ReversePairs {

	public static void main(String[] args) {
		int[] nums = {1,3,2,3,1};
		System.out.println(reversePairs(nums));

	}
	
	public static  int reversePairs(int[] nums) {
	       int c=0;
	       int i=0,j=1;
	       while(i<j && j<nums.length){
	           if(nums[i]>2*nums[j]){
	               c++;
	           }
	           j++;i++;
	       }
	       return c; 
	    }

}
