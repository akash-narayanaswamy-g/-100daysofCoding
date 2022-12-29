package ArrayProblems;

//1929. Concatenation of Array
//https://leetcode.com/problems/concatenation-of-array/description/

import java.util.*;

public class Concatenation {

	public static void main(String[] args) {
		int a[]= {1,2,1};
		System.out.println(Arrays.toString(getConcatenation(a)));

	}
	public static int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        int c=0;
        for(int i=0;i<nums.length*2;i++){
            if(c<nums.length){
                ans[i]=nums[c];
                c++;
            }
            else{
                c=0;
                ans[i]=nums[c];
                c++;
            }
        }
        return ans;
    }

}
