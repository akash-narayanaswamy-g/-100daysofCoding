package Binary_Search;


//81. Search in Rotated Sorted Array II
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

public class SearchInRotatedSortedArrayII {

	public static void main(String[] args) {
		int[] nums = {2,5,6,0,0,1,2};
		int target = 0;
		System.out.println(search(nums, target));

	}
	
	public static boolean search(int[] nums, int target) {
		int low=0;
      int high=nums.length-1;
     while(low<=high)
     {
         int mid = low+(high-low)/2;
         if(nums[mid]==target)
         return true;
         if((nums[mid]==nums[low])&&(nums[high]==nums[mid]))
         {
              low++;
              high--;
         }
         else if (nums[mid]>=nums[low])
         {
             if(target>=nums[low]&&target<nums[mid])
              high = mid-1;
             else
              low = mid+1;
         }
         else
         {
             if(target>nums[mid]&&target<=nums[high])
              low = mid+1;
             else
              high = mid-1;
         }
     }
     return false;
  }

}
