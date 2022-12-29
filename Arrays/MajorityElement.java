package ArrayProblems;
import java.util.*;

//169. Majority Element
//https://leetcode.com/problems/majority-element/description/

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr= {2,2,1,1,1,2,2};
		System.out.println(majorityElement(arr));

	}
	public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
   }

}
