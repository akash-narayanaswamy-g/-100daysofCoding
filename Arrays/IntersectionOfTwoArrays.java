package ArrayProblems;
import java.util.*;
//349. Intersection of Two Arrays
//https://leetcode.com/problems/intersection-of-two-arrays/description/

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] nums1={1,2,2,1};
		int[] nums2={2,2};
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
		
	}
	public static int[] intersection(int[] nums1, int[] nums2) 
	{
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        
        for (int i = 0; i < nums1.length; i++) set1.add(nums1[i]);
        for (int j = 0; j < nums2.length; j++) if(set1.contains(nums2[j]))set2.add(nums2[j]);
        
        return set2.stream().mapToInt(Integer::intValue).toArray();

    }

}
