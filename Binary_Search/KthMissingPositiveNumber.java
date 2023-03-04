package Binary_Search;

//1539. Kth Missing Positive Number
//https://leetcode.com/problems/kth-missing-positive-number/description/

public class KthMissingPositiveNumber {

	public static void main(String[] args) {
		int[] arr = {2,3,4,7,11};
		int k = 5;
		System.out.println(findKthPositive(arr, k));

	}
	
	public static int findKthPositive(int[] arr, int k) {
        int s=0,l=arr.length-1;
        while(s<=l) {
        	int mid=s+(l-s)/2;
        	if(arr[mid]-mid-1<k)s=mid+1;
        	else l=mid-1;
        }
        return s+k;
    }

}
