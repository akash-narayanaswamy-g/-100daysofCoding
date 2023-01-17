package Recursion;

//https://practice.geeksforgeeks.org/problems/quick-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=quick-sort
import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {4 ,1, 3, 9, 7};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static void sort(int[] arr,int low,int high) {
		if(low>=high)return;
		
		int s=low;
		int e=high;
		int mid=s+(e-s)/2;
		int pivot=arr[mid];
		
		//this is the check which stops it from further splits
		//it is the reason why if it is sorted it will not swap		
		while(s<=e) {
			while(arr[s]<pivot)
				s++;
			while(arr[e]>pivot)
				e--;

			if(s<=e) {
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
			
			//after the above steps pivot is in the correct position
			//now we make the recursive call
			sort(arr,low,e);
			sort(arr,s,high);
			 
		}
	}

}
