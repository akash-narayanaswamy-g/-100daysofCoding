package Binary_Search;

//https://leetcode.com/problems/guess-number-higher-or-lower/
//374. Guess Number Higher or Lower
public class GuessNumberHigherorLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Solution extends GuessGame {
	    public int guessNumber(int n) {
	       int low = 1;
	        int high = n;
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            int res = guess(mid);
	            if (res == 0)
	                return mid;
	            else if (res < 0)
	                high = mid - 1;
	            else
	                low = mid + 1;
	        }
	        return -1;
	    }

}
