 package Binary_Search;

 //2089. Find Target Indices After Sorting Array
 //https://leetcode.com/problems/find-target-indices-after-sorting-array/description/
 
import java.util.*;

public class ArrayOfTargetIndices {

	public static void main(String[] args) {
		int[] nums= {1,2,5,2,3};
		int target=2;
		System.out.println(targetIndices(nums, target));

	}
	
	public static List<Integer> targetIndices(int[] nums, int target) {
		Arrays.sort(nums);
		List<Integer> l=new ArrayList<>();
		int start=0,end=nums.length-1;
		while (start<=end) {
			int mid=start+(end-start)/2;
			if(nums[mid]>target)
				end=mid-1;
			else if(nums[mid]<target)
				start=mid+1;
			else {
				start=mid;
				end=mid;
				while (start-1>=0 && nums[start-1]==target) {
					//l.add(--start);
					--start;
				}
				while (end+1< nums.length && nums[end+1]==target) {
					//l.add(++end);
					++end;
				}
				for(int i=start;i<=end;i++) {
					l.add(i);
				}
				return l;
				
			}
		}
		return l;
    }

}
