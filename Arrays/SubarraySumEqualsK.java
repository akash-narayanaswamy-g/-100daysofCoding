package ArrayProblems;

//560. Subarray Sum Equals K
//https://leetcode.com/problems/subarray-sum-equals-k/description/

public class SubarraySumEqualsK {

	public static void main(String[] args) {
		int[] arr= {1,1,1};
		int k=2;
		System.out.println(subarraySum(arr, k));

	}
	
	public static int subarraySum(int[] nums, int k) {
        int c=0;
        for (int i = 0; i < nums.length; i++) {
			int sum=0;
			for (int j = i; j < nums.length; j++) {
				sum+=nums[j];
				if(sum==k)c++;
			}
		}
        return c;
       
    }

}
