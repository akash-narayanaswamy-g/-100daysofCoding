package ArrayProblems;


import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));

	}
	public static List<List<Integer>> threeSum(int[] nums) {
     
      List<List<Integer>> triplets = new ArrayList<>();
     
      for (int i = 0; i < nums.length; i++) {
		for (int j = i+1; j < nums.length; j++) {
			 HashSet<Integer> S = new HashSet<>();
			for (int j2 = j+1; j2 < nums.length; j2++) {
				if(nums[i]+nums[j]+nums[j2]==0) {
					S.add(nums[i]);
					S.add(nums[j]);
					S.add(nums[j2]);
				}
			}
			if(!S.isEmpty())
				triplets.add(new ArrayList<>(S));
		}
	}
      return triplets;  
}

}
