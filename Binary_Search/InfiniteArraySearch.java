package Binary_Search;

public class InfiniteArraySearch {

	public static void main(String[] args) {
		int arr[]= {1,22,33,44,55,66,77,88,99,159,753,852,951,999,1000,1560,9852,2225488};
		int target=99;
		System.out.println(findRange(arr, target));

	}
	
	public static int findRange(int[] arr,int target) {
		int start=0,end=1; 
		
		while(target>arr[end]) {
			int temp=end+1;
			//doubling the range for chek
			end+=(end-start+1)*2;
			start=temp;
		}
		return binarySearch(arr, target,start,end);
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
