package Binary_Search;
//852. Peak Index in a Mountain Array
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//162. Find Peak Element

public class FindingPeak {

	public static void main(String[] args) {
		int arr[]= {0,10,5,2};
		System.out.println(peakIndexInMountainArray(arr));

	}
	 public static int peakIndexInMountainArray(int[] arr) {
	       int s=0,l=arr.length-1;
			while(s<l) {
	    	   int mid=s+(l-s)/2;
	    	   if(arr[mid]>arr[mid+1])
	    		   l=mid;
	    	   else if(arr[mid]<arr[mid+1])
	    		   s=mid+1;
				       }

	       return s;	        
	    }

}
