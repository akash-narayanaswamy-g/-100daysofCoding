package ArrayProblems;
//45. Jump Game II
//https://leetcode.com/problems/jump-game-ii/description/

public class JumpGameII {

	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		System.out.println(jump(nums));

	}
	
	public static int jump(int[] nums) {
        int c = 0, n = nums.length;
        int curEnd = 0, curFar = 0;
        
        for (int i = 0; i < n - 1; ++i) {
            
            curFar = Math.max(curFar, i + nums[i]);
            if (i == curEnd) {
                c++;
                curEnd = curFar;
            }
        }
        
        return c;
    }

}
