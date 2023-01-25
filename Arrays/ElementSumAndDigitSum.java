package ArrayProblems;

//2535. Difference Between Element Sum and Digit Sum of an Array
//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/

public class ElementSumAndDigitSum {

	public static void main(String[] args) {
		int[] nums = {1,15,6,3};
		System.out.println(differenceOfSum(nums));
	}
	
	public static int differenceOfSum(int[] nums) {
        int elsum=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++){
            elsum+=nums[i];
            while(nums[i]!=0) {
            digitsum+=nums[i]%10;
            nums[i]/=10;
            }
        }
        return Math.abs(elsum-digitsum);
    }

}
