package ArrayProblems;

//56. Merge Intervals
//https://leetcode.com/problems/merge-intervals/description/
import java.util.*;

public class MergeIntervals {

	public static void main(String[] args) {
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		System.out.println(Arrays.deepToString(merge(intervals)));

	}
	
	
	/*
	 Under the hood the function will be called many times with pairs of elements in the array and will be sorted from "smallest" to "largest" according to the comparison function. 
	 If the function returns a negative number, then a will be considered "larger" than b, if it returns a positive one then a is "smaller" than b, and if 0 then it is a tie.
	 */
	
	public static int[][] merge(int[][] intervals) {
		List<int[]> res=new ArrayList<>();
		if(intervals==null || intervals.length==0)
			return intervals;
		Arrays.sort(intervals, (a,b)->a[0]-b[0]);
		
		int s=intervals[0][0];
		int e=intervals[0][1];
		
		for(int[] i:intervals) {
			if(i[0]<=e)
				e=Math.max(e,i[1]);
			else {
				res.add(new int[] {s,e});
				s=i[0];
				e=i[1];
				
			}
		}
		res.add(new int[] {s,e});
		return res.toArray(new int[0][]);
    }

}
