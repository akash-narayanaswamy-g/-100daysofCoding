package ArrayProblems;

import java.util.Arrays;

//1470. Shuffle the Array
//https://leetcode.com/problems/shuffle-the-array/description/
public class ShufflingArray {

	public static void main(String[] args) {
		int[] c= {2,5,1,3,4,7};
		int n=3;
		System.out.println(Arrays.toString(shuffle(c, n)));

	}
	
	public static int[] shuffle(int[] nums, int n) {
		 int[] a=new int[2*n];
		int index=0;
		for (int i = 0; i < n; i++) {
			a[index++]=nums[i];
			a[index++]=nums[n+i];
		}
		return a;
        
    }

}
