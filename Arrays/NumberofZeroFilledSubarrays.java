package ArrayProblems;

//2348. Number of Zero-Filled Subarrays
public class NumberofZeroFilledSubarrays {

	public static void main(String[] args) {
		int[] nums = {1,3,0,0,2,0,0,4};
		System.out.println(zeroFilledSubarray(nums));

	}
	
	public static long zeroFilledSubarray(int[] nums) {
        long res=0,c=0;
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0)
				c++;
			else {
				res+=c*(c+1)/2;
				c=0;
			}
		}
        if(c!=0)
        	res+=c*(c+1)/2;
        return res;
    }

}
