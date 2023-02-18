package ArrayProblems;

import java.util.*;

//2008. Maximum Earnings From Taxi
//https://leetcode.com/problems/maximum-earnings-from-taxi/description/
public class MaximumEarningsFromTaxi {

	public static void main(String[] args) {
		int n = 5;
		int[][] rides = {{2,5,4},{1,5,1}};
		System.out.println(maxTaxiEarnings(n, rides));

	}
	
	public static long maxTaxiEarnings(int n, int[][] rides) {
        Arrays.sort(rides, (a,b) -> a[0] - b[0]);
        long max = 0;
        PriorityQueue<long[]> myQueue = new PriorityQueue<long[]>((a,b) -> Long.compare(a[0],b[0]));

        for (int i = 0; i < rides.length; i++) {
            int start = rides[i][0];
            int end = rides[i][1];
            long profit = end - start + Long.valueOf(rides[i][2]);

            while (!myQueue.isEmpty() && start >= myQueue.peek()[0]) {
                max = Math.max(max, myQueue.peek()[1]);
                myQueue.poll();
            }
            myQueue.offer(new long[] {end, profit + max});
        }

        while (!myQueue.isEmpty()) {
            max = Math.max(max, myQueue.poll()[1]);
        }

        return max;
    }

}
