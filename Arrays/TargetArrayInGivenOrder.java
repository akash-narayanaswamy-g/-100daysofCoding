package ArrayProblems;
//1389. Create Target Array in the Given Order
//https://leetcode.com/problems/create-target-array-in-the-given-order/description/

import java.util.Arrays;

public class TargetArrayInGivenOrder {

	public static void main(String[] args) {
		int[] nums= {0,1,2,3,4};
		int[] index= {0,1,2,2,1};
		System.out.println(Arrays.toString(createTargetArray(nums, index)));

	}
	public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
        	if(target[index[i]]==0)
                target[index[i]]=nums[i];
        	else {
        		
        		target[index[i]+1]=target[index[i]];
        		target[index[i]]=nums[i];
        	}
        }
        return target;
    }

}
