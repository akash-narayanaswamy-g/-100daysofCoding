package ArrayProblems;

//2149. Rearrange Array Elements by Sign
//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

import java.util.Arrays;

public class RearrangeArrayElementsbySign {

	public static void main(String[] args) {
		int[] nums= {3,1,-2,-5,2,-4};
		System.out.println(Arrays.toString(rearrangeArray(nums)));

	}
	
	public static int[] rearrangeArray(int[] nums) {
		int[] p=new int[nums.length/2];
		int p1=0;
		int n1=0;
		int[] n=new int[nums.length/2];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0) {
				p[p1]=nums[i];
				p1++;
			}
			else {
				n[n1]=nums[i];
				n1++;
			}
		}
		int j=0;
		for (int i = 0; i < n.length; i++) {
			nums[j++]=p[i];
			nums[j++]=n[i];
		}
		return nums;
        
    }
	
	/*
	 int s = nums.length;
    int [] arr = new int[s];
    
    int p = 0;
    int n = 1;
    for(int i =0;i < s;i++)
    {
        if(nums[i] > 0){
            arr[p] =nums[i];
            p =p+2;
        }else{
            arr[n] = nums[i];
            n = n+2;
        }
    }
    
    return arr;
	 */

}
