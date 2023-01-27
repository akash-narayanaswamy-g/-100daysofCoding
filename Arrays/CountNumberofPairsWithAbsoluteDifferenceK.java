package ArrayProblems;
import java.util.*;

//2006. Count Number of Pairs With Absolute Difference K
//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/
public class CountNumberofPairsWithAbsoluteDifferenceK {

	public static void main(String[] args) {
		int[] nums = {1,2,2,1};
		int k = 1;
		System.out.println(countKDifference(nums, k));

	}
	
	public static int countKDifference(int[] nums, int k) {
		int c=0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(i<j) {
					if(Math.abs(nums[i]-nums[j])==k) {
						c++;
					}
				}
			}
		}
        return c;
    }

}
