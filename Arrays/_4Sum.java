package ArrayProblems;
import java.util.*;

//18. 4Sum
//https://leetcode.com/problems/4sum/description/

public class _4Sum {

	public static void main(String[] args) {
		int[] nums = {1,0,-1,0,-2,2};
		int target = 0;
		System.out.println(fourSum(nums, target));

	}
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
   return kSum(nums, target, 0, 4);
}

public static List<List<Integer>> kSum(int[] nums, long target, int start, int k) {
   List<List<Integer>> res = new ArrayList<>();

   
   if (start == nums.length) {
       return res;
   }
   
   
   long average_value = target / k;
   
   
   if  (nums[start] > average_value || average_value > nums[nums.length - 1]) {
       return res;
   }
   
   if (k == 2) {
       return twoSum(nums, target, start);
   }

   for (int i = start; i < nums.length; ++i) {
       if (i == start || nums[i - 1] != nums[i]) {
           for (List<Integer> subset : kSum(nums, target - nums[i], i + 1, k - 1)) {
               res.add(new ArrayList<>(Arrays.asList(nums[i])));
               res.get(res.size() - 1).addAll(subset);
           }
       }
   }

   return res;
}

public static List<List<Integer>> twoSum(int[] nums, long target, int start) {
   List<List<Integer>> res = new ArrayList<>();
   int lo = start, hi = nums.length - 1;

   while (lo < hi) {
       int currSum = nums[lo] + nums[hi];
       if (currSum < target || (lo > start && nums[lo] == nums[lo - 1])) {
           ++lo;
       } else if (currSum > target || (hi < nums.length - 1 && nums[hi] == nums[hi + 1])) {
           --hi;
       } else {
           res.add(Arrays.asList(nums[lo++], nums[hi--]));
       }
   }
                                                     
   return res;
}

}
