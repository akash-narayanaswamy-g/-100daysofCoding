package Recursion;

import java.util.Arrays;

public class MergeSortInplace {

	public static void main(String[] args) {
		int[] arr= {4 ,1, 3, 9, 7};
		mergeSort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
    static void mergeSort(int arr[], int s, int e)
    {
        if(e-s==1)return;
        
        int m=(s+e)/2;
        mergeSort(arr, s, m);
        mergeSort(arr, m, e);
        
        merge(arr, s, m, e);
    }
    
    static void merge(int arr[], int s, int m, int e)
    {
        int[] ans=new int[e-s];
        
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e) {
        	if(arr[i]<arr[j])
        		ans[k++]=arr[i++];
        	else
        		ans[k++]=arr[j++];
        }
        
        while(i<m) {
        	ans[k++]=arr[i++];
        }
        
        while(j<e) {
        	ans[k++]=arr[j++];
        }
        
        for (int k2 = 0; k2 < ans.length; k2++) {
			arr[s+k2]=ans[k2];
		}
        
    }

}
