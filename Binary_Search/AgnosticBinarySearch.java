package Binary_Search;

public class AgnosticBinarySearch {

	public static void main(String[] args) {
		int arr[]= {11,22,33,55,66,88,99,9685,87400};
		int arr2[]= {99,88,77,66,44,33,22,11};
		int target=66;
		System.out.println(AgnosticSearch(arr2, target));
		} 
		
		static int AgnosticSearch(int[] arr,int target) {
			int start=0,end=arr.length-1;
					
			boolean isAsc=arr[start]<arr[end];
			while (start<=end) {
				int mid=start+(end-start)/2;
				if(arr[mid]==target)
					return mid;
				else if(isAsc) {
					if(arr[mid]>target)
						end=mid-1;
					else
						start=mid+1;
				}
				else {
					if(arr[mid]<target)
						end=mid-1;
					else
						start=mid+1;
				}
				
		}
			return -1;

	}

}
