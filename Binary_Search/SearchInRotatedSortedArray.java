package Binary_Search;

//33. Search in Rotated Sorted Array
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int arr[]= {1};
		int target = 0;
		System.out.println(search(arr, target));
		

	}
	
	public static int search(int[] arr, int target) {
        int pivot=findPivot(arr);
        if(pivot==-1)
        	return binarySearch(arr, target, 0, arr.length-1);
        int ans=binarySearch(arr, target,0,pivot);
        if(ans!=-1)
        	return ans;
        return binarySearch(arr, target, pivot+1, arr.length-1);
		}
	
	static int findPivot(int[] arr) {
		int start=0,end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1])
				return mid;
			else if(mid>start && arr[mid]<arr[mid-1])
				return mid-1;
			else if(arr[start]>=arr[mid])
				end=mid-1;
			else
				start=mid+1;		
		}
		return -1;
	}
	static int binarySearch(int[] arr,int target,int start,int end) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]>target)
				end=mid-1;
			else
				start=mid+1;
			
		}
		return -1;
	}
        
}
