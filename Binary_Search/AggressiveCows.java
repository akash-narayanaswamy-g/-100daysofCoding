package Binary_Search;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/aggressive-cows/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=aggressive-cows

public class AggressiveCows {

	public static void main(String[] args) {
		int n=5,k=3;
		int[] stalls = {1, 2, 4, 8, 9};
		System.out.println(solve(n, k, stalls));

	}
	
	public static int solve(int n, int k, int[] stalls) {
		Arrays.sort(stalls);
		int s=1,end=stalls[n-1]-stalls[0];
		int ans=1;
		while(s<=end) {
			int mid=s+(end-s)/2;
			if(canPlaceCows(stalls,n,k,mid)) {
				ans=mid;
				s=mid+1;
			}
			else end=mid-1;
		}
		return ans;
	}

	private static boolean canPlaceCows(int[] stalls, int n, int cows, int dist) {
		int coordinate=stalls[0],cut=1;
		for (int i = 1; i < n; i++) {
			if(stalls[i]-coordinate>=dist) {
				coordinate=stalls[i];
				cut++;
			}
			if(cut==cows)
				return true;
		}
		return false;
	}

}
