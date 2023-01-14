package ArrayProblems;

import java.util.Arrays;

//1389. Create Target Array in the Given Order
//https://leetcode.com/problems/create-target-array-in-the-given-order/

public class createingTargetArray {

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
		System.out.println(Arrays.toString(createTargetArray(nums, index)));

	}
	
	public static int[] createTargetArray(int[] nums, int[] index) {
int[] target = new int[nums.length];
        
        for(int i = 0; i < index.length; i++){
            int ind = index[i];
            
            if(ind < i){
                int j = i;
                while(j > ind){
                    target[j] = target[j - 1]; 
                    target[j - 1] = nums[i];
                    j--;
                }
            }
            else{
                 target[i] = nums[ind];
            }
            
        }
        return target;
        
	    }

}
