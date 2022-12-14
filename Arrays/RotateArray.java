package ArrayProblems;

//189. Rotate Array
//https://leetcode.com/problems/rotate-array/

class Solution1 {    
    public void rotate(int[] nums, int k) {
    	
    	int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
        return;
        
    }
}

public class RotateArray {

	public static void main(String[] args) {
		Solution1 obj=new Solution1();
		int[] nums= {1,2,3,4,5,6,7};
		int k=3;
		obj.rotate(nums, k);
		for (int i : nums) {
			System.out.print(i);
		}
		
	}

}
