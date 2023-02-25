package Binary_Search;

//Check if array is sorted
//https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted


public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		int N = 5;
		int arr[] = {10, 20, 30, 40, 50};
		System.out.println(arraySortedOrNot(arr, N));

	}
	
	static boolean arraySortedOrNot(int[] arr, int n) {
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }

}
