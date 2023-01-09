package Sorting_Techniques;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicatesInAnArray {

	public static void main(String[] args) {
		int[] arr= {4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(arr));

	}
	
	public static List<Integer> findDuplicates(int[] arr) {
		List<Integer> l=new ArrayList<>();
		int i=0;
		while (i<arr.length) {
			int correctindex=arr[i]-1;
			if(arr[i]!=arr[correctindex]) {
				swap(arr, i, correctindex);
			}
			else
				i++;
		}
		
		for (int i1 = 0; i1 < arr.length; i1++) {
			if(arr[i1]!=i1+1)
				l.add(arr[i1]);
		}
		return l;
        
    }
	
	private static void swap(int[] arr, int i, int j) {
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;		
	}

}
