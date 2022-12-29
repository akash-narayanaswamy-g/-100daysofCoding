package ArrayProblems;

//1480. Running Sum of 1d Array
//https://leetcode.com/problems/running-sum-of-1d-array/description/
import java.util.Arrays;

public class RunningSum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		System.out.println(Arrays.toString(runningSum(arr)));

	}
	 public static int[] runningSum(int[] nums) {
	        int a[]=new int[nums.length];
	        int sum=0;
	        for (int i = 0; i < nums.length; i++) {
				sum+=nums[i];
				a[i]=sum;
			}
	        return a;
	    }

}
