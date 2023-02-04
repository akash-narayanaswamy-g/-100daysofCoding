package ArrayProblems;
import java.util.*;

//2037. Minimum Number of Moves to Seat Everyone
//https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/
public class MinimumNumberofMovestoSeatEveryone {

	public static void main(String[] args) {
		int[] seats = {3,1,5}, students = {2,7,4};
		System.out.println(minMovesToSeat(seats, students));

	}
	
	public static int minMovesToSeat(int[] seats, int[] students) {
	    Arrays.sort(seats);
	    Arrays.sort(students);
	    int noMoves = 0;
	    for (int i = 0; i < seats.length; ++i) {
	        noMoves += Math.abs(seats[i] - students[i]);
	    }
	    return noMoves;
	}

}
