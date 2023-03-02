package Binary_Search;

public class FindtheSmallestDivisorGivenaThreshold {

	public static void main(String[] args) {
		int[] nums = {44,22,33,11,1};
		int threshold = 5;
		System.out.println(smallestDivisor(nums, threshold));

	}
	
	 public static int smallestDivisor(int[] nums, int threshold) {
	        int ans=1,min=0,max=0;
	        
	        for (int i = 0; i < nums.length; i++) {
				max=Math.max(max, nums[i]);
				min=Math.min(min, nums[i]);
			}
	        while(min<=max) {
	        	int m=min+(max-min)/2;
	        	if(isDivisor(nums,threshold,m)) {
	        		ans=m;
	        		max=m-1;
	        	}
	        	else
	        		min=m+1;
	        }
	        
	        return ans;
	    }

	private static boolean isDivisor(int[] nums, int threshold, int m) {
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum+=Math.ceil(nums[i]*1.0/m);
		}
		return sum<=threshold;
	}

}
