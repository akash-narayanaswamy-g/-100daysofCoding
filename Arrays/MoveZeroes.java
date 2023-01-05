package ArrayProblems;

import java.util.Arrays;

//283. Move Zeroes
//https://leetcode.com/problems/move-zeroes/description/

public class MoveZeroes {

	public static void main(String[] args) {
		int[] arr= {0,1,0,3,12};
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void moveZeroes(int[] nums) {
	       int[] t=new int[nums.length];
	        int c=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]!=0){
	                t[c]=nums[i];c++;
	            }
	        }
	        for(int i=0;i<nums.length;i++){
	            nums[i]=t[i];
	        }
	    }

}
