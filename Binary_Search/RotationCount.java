package Binary_Search;

public class RotationCount {

	public static void main(String[] args) {
		int arr[]= {4,5,6,7,0,1,2};
		System.out.println(count(arr));

	}
	
	static int count(int[] arr) {
		int c=0;
		int s=0,e=arr.length-1;
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(arr[mid]>arr[mid+1])
				return mid+1;
			else if(arr[mid]<arr[mid-1])
				return mid;
			else if(arr[s]>arr[mid])
				e=mid-1;
			else
				s=mid+1;
		}
		return c;
	}

}
