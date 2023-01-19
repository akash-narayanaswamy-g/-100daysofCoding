package ArrayProblems;
import java.util.*;

//128. Longest Consecutive Sequence
//https://leetcode.com/problems/longest-consecutive-sequence/description/

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums = {100,4,200,1,3,2};
		System.out.println(longestConsecutive(nums));

	}
	
	public static int longestConsecutive(int[] nums) {
        int longs=0;
        HashSet<Integer>  s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
           if(!s.contains(nums[i]-1))
           {
               int curr=nums[i],currStreak=1;
               while(s.contains(curr+1)){
                   curr+=1;
                   currStreak+=1;
               }
               longs=Math.max(longs,currStreak);
           }
        }
        return longs;

    }

}
