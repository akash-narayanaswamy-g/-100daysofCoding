package ArrayProblems;

import java.util.*;

//1313. Decompress Run-Length Encoded List
//https://leetcode.com/problems/decompress-run-length-encoded-list/

public class DecompressingArray {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4};
		//decompressRLElist(nums);
		System.out.println(Arrays.toString(decompressRLElist(nums)));

	}
	
    public static int[] decompressRLElist(int[] nums) {
    	List<Integer> arr=new ArrayList<>();
    	for (int i = 0; i < nums.length; i+=2) {
			for (int j = 0; j < nums[i]; j++) {
				arr.add(nums[i+1]);
			}
		}
 
    	return arr.stream().mapToInt(Integer::intValue).toArray();
    }


}
