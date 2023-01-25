package ArrayProblems;

//1588. Sum of All Odd Length Subarrays
//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/description/

public class SumOfAllOddLengthSubarrays {

	public static void main(String[] args) {
		int[] arr = {1,4,2,5,3};
		System.out.println(sumOddLengthSubarrays(arr));

	}
	
	public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length, answer = 0;
        
        for (int i = 0; i < n; ++i) {
            int left = i, right = n - i - 1;
            answer += arr[i] * (left / 2 + 1) * (right / 2 + 1);
            answer += arr[i] * ((left + 1) / 2) * ((right + 1) / 2);
        }
        
        return answer;
    }

}
