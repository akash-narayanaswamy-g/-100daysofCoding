package ArrayProblems;
import java.util.*;

//1365. How Many Numbers Are Smaller Than the Current Number
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

public class SmallerNumberCount {

	public static void main(String[] args) {
		int[] a= {8,1,2,2,3};
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(a)));

	}
	public static int[] smallerNumbersThanCurrent(int[] nums) {
		 int[]ans=nums.clone();
	        for (int i = 0; i < ans.length; i++) {
				int c=0;
				for (int j = 0; j < ans.length; j++) {
					if(ans[i]>nums[j])
						c++;
				}
				ans[i]=c;
			}
	        return ans;
        
    }
	
	 static int[] OptimisedMethod(int[] nums) {
		 int[] ans=new int[102];
			for (int n : nums) {
				ans[n]++;
			}
			
			for (int i = 1; i < ans.length; i++) {
				ans[i]+=ans[i-1];
			}
			int[] result=new int[nums.length];
			for (int i = 0; i < nums.length; i++) {
				if(nums[i]==0)
					result[i]=0;
				else
					result[i]=ans[nums[i]-1];
			}
			
			return result;
	}

}
