package BitManipulation;
import java.util.*;
//268. Missing Number
//https://leetcode.com/problems/missing-number/description/

public class MissingNumber {

	public static void main(String[] args)
	{
		int nums[]= {5,4,2,0,1};
		System.out.println(missingNumber(nums));

	}
	
	public static int missingNumber(int[] nums) {
        boolean []a=new boolean[nums.length+1];
        for (int i = 0; i < a.length-1; i++) {
			a[nums[i]]=true;
		}
        for (int j = 0; j < a.length-1; j++) {
			if(!a[j])
				return j;
		}
        return 0;
        
    }
	
	public int missingNumber2(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for(; i < nums.length; i++){
            if(nums[i] != i)
                return i;
        }
        return i;
    }

}
