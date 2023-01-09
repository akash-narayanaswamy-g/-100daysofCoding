package Sorting_Techniques;

//645. Set Mismatch
//https://leetcode.com/problems/set-mismatch/description/
import java.util.Arrays;

public class SetMismatch {

	public static void main(String[] args) {
		int[] arr= {1,2,2,4};
		System.out.println(Arrays.toString(findErrorNums(arr)));
	}
	
	 public static int[] findErrorNums(int[] arr) {
	        
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
				if(arr[i1]!=i1+1){
					return new int[]{arr[i1],i1+1};
	            }
			}
			return new int[]{-1,-1};
	    }
	   private static void swap(int[] arr, int i, int j) {
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;		
		}

}
