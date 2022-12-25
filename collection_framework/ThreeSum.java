package Collection_framework;
import java.util.*;

//https://leetcode.com/problems/3sum/description/
//15. 3Sum

public class ThreeSum {

	public static void main(String[] args) {
		int arr[]= {-1,0,1,2,-1,-4};
		System.out.println(threeSum(arr));

	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> obj=new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if(i>0 && nums[i]==nums[i-1])
				continue;
				
			int j=i+1;
			int k=nums.length-1;
			while(j<k) {
				if(nums[i]+nums[j]+nums[k]==0) {
					obj.add(Arrays.asList(nums[i],nums[j],nums[k]));
					j++;
					while(j<k && nums[j]==nums[j-1])
						j++;
				}
				else if(nums[i]+nums[j]+nums[k]<0)
					j++;
				else
					k--;
			}
			
		}
		return obj;
        
}

}
