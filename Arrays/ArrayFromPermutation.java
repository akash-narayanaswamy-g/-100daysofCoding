package ArrayProblems;

import java.util.Arrays;

//1920. Build Array from Permutation
//https://leetcode.com/problems/build-array-from-permutation/description/
public class ArrayFromPermutation {

	public static void main(String[] args) {
		int[] a= {0,2,1,5,3,4};
		System.out.println(Arrays.toString(buildArray(a)));

	}
	
	public static int[] buildArray(int[] nums) {
		int ans[]=new int[nums.length];
        for (int i = 0; i <= ans.length-1; i++) {
			ans[i]=nums[nums[i]];
		}
        return ans;
    }

}
