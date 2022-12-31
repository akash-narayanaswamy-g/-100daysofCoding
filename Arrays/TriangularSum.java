package ArrayProblems;

//2221. Find Triangular Sum of an Array
//https://leetcode.com/problems/find-triangular-sum-of-an-array/description/

public class TriangularSum {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
		System.out.println(triangularSum(nums));

	}
	
	public static int triangularSum(int[] nums) { 
		int n=nums.length,j=0;
        if(n==1)
            return nums[0];
        int[] arr=new int[n-1]; 
        for (int i = 0; i < n-1; i++) {
			arr[j++]=(nums[i] + nums[i+1]) % 10;	
		}
        return triangularSum(arr); 	 	
    }

}
