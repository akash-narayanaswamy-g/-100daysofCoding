package MathConceptProblems;

//1523. Count Odd Numbers in an Interval Range
//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
public class CountOddNumbersInAnIntervalRange {

	public static void main(String[] args) {
		int low = 3, high = 7;
		System.out.println(countOdds(low, high));

	}
	
	public static int countOdds(int low, int high) {
        if((low&1)==0)
            low++;
        return low>high?0:(high-low)/2+1;
    }

}
