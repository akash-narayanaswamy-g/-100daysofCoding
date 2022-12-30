package Binary_Search;

public class binarySearchInArray {

	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,7,8,9,12,13,19,111};
		int target=1;
		System.out.println(search(ar, target));

	}
	
	static int search(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
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
