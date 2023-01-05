package ArrayProblems;

//485. Max Consecutive Ones
//https://leetcode.com/problems/max-consecutive-ones/description/
public class MaxConsecutiveOne {

	public static void main(String[] args) {
		int[] arr= {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(arr));
	}
	public static int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                c++;
            else {
                if(max<c)
                    max=c;
                c=0;
            }
        }
        if(max>c)return max; else return c;
    }

}
