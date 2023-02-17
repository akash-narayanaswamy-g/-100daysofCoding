package ArrayProblems;
//Max sum in sub-arrays
//https://practice.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category=&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays

public class MaxSumInSubArrays {

	public static void main(String[] args) {
		long arr[] = {4, 3, 1, 5, 6};
		System.out.println(pairWithMaxSum(arr, arr.length));
	}
	
	public static long pairWithMaxSum(long arr[], long N)
    {
        if (N < 2)
             return -1;
 
        long res = arr[0] + arr[1];
        for (int i=1; i<N-1; i++)
            res = Math.max(res, arr[i] + arr[i+1]);
         
        return res;
    }

}
