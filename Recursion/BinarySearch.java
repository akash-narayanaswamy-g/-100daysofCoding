package Recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {1,56,66,78,99,105,123,156};
		int target=66;
		System.out.println("The target "+target+" is at the index "+BinSearch(arr, target, 0, arr.length-1));
		

	}
	public static int BinSearch(int arr[],int target,int s,int e) {
		if(s>e)
			return -1;
		int mid =s+(e-s)/2;
		if(arr[mid]==target)
			return mid;
		if(arr[mid]>target)
			return BinSearch(arr, target, s, mid-1);
		
		return BinSearch(arr, target, mid+1, e);
		
	}

}
