package Binary_Search;

//Allocate minimum number of pages
//https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=allocate-minimum-number-of-pages
public class AllocateMinimumNumberOfPages {

	public static void main(String[] args) {
		int N = 4,M = 5,A[] = {12, 34, 67, 90};
		System.out.println(findPages(A, N, M));
	}
	
	public static int findPages(int[]arr,int n,int students)
    {
		int ans=-1,s=arr[n-1],l=0;
        if(n<students) return -1;
		for (int i = 0; i < n; i++) {
			l+=arr[i];
		}
		
		while (s<=l) {
			int mid=s+(l-s)/2;
			if(isMinimum(arr,n,students,mid)) {
				ans=mid;
				l=mid-1;
			}
			else s=mid+1;
		}
		
        return ans;
    }

	private static boolean isMinimum(int[] arr, int n, int students, int mid) {
		int sum=0,count=1;
		for (int i = 0; i < n; i++) {
			sum+=arr[i];
			if(arr[i]>mid)return false; 
			if(sum>mid) {
				count++;
				sum=arr[i];
			}
		}
		return count<=students;
	}

}
