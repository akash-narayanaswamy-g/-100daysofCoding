package ArrayProblems;

//Union of Two Sorted Arrays
//https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays


import java.util.*;
public class UnionAndIntersectionOfArray {

	public static void main(String[] args) {
		int n = 5,m = 3;
		int arr1[] = {1, 2, 3, 4, 5},arr2 [] = {1, 2, 3};
		System.out.println(findUnion(arr1, arr2, n, m));
		System.out.println(optimal(arr1, arr2, n, m));

	}
	private static ArrayList<Integer> optimal(int[] arr1, int[] arr2, int n, int m) {
		TreeSet<Integer> s=new TreeSet<>();
		for (int i : arr1) {
			s.add(i);
		}
		for (int i : arr2) {
			s.add(i);
		}
		
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i:s) {
			ans.add(i);
		}
		return ans;
	}
	public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> s=new ArrayList<>();
        int max=arr1[n-1]>arr2[m-1]?arr1[n-1]:arr2[m-1];
        int ans[]=new int[max+1];
        for(int i=0;i<n;i++){
            ans[arr1[i]]++;
        }
        for(int i=0;i<m;i++){
            ans[arr2[i]]++;
        }
        for(int j=0;j<ans.length;j++){
            if(ans[j]>0)
                s.add(j);
        }        
        return s;
    }

}
