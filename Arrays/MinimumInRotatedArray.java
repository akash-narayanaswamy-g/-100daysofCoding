package ArrayProblems;

//153. Find Minimum in Rotated Sorted Array
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class MinimumInRotatedArray {

	public static void main(String[] args) {
		int[] arr= {1,2};
		System.out.println(findMin(arr));

	}
	 public static int findMin(int[] nums) {
		 if (nums == null || nums.length == 0) { 
	            return Integer.MAX_VALUE;
	        }
	        int left = 0;
	        int right = nums.length - 1;
	        while (left + 1 < right) {
	            int mid = left + (right - left) / 2;
	            if (nums[mid] > nums[left] && nums[mid] > nums[right]) {
	                left = mid;
	            } else {
	                right = mid;
	            }
	        }
	        return Math.min(nums[left], nums[right]);
			 
	 }

}
