package Sorting_Techniques;

//Bubble Sort
//https://practice.geeksforgeeks.org/problems/bubble-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bubble-sort
import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		int[] arr= {9,8,7,6,4,5,2,44,1,23};
		System.out.println("Before sorting : "+Arrays.toString(arr));
		bubble(arr);
		System.out.println("After sorting : "+Arrays.toString(arr));

	}
	
	public static void bubble(int arr[]) {
	boolean flag=true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					flag=false;
					arr[j-1]^=arr[j];
					arr[j]^=arr[j-1];
					arr[j-1]^=arr[j];
				}
			}
			if(flag)
				break;
		}
	}
	
	

}
