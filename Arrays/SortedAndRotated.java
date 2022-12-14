package ArrayProblems;

//1752. Check if Array Is Sorted and Rotated
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

class Solution {
    public boolean check(int[] nums) {
    	int flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length])
                flag++;
            
        }
        if(flag>1)
            return false;
        return true;
        
    }
}
public class SortedAndRotated {

	public static void main(String[] args) {
		Solution obj=new Solution();
		int[] nums= {2,1,3,4};
		System.out.println(obj.check(nums));

	}

}
