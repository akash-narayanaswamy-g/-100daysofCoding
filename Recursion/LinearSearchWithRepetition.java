package Recursion;

import java.util.*;
public class LinearSearchWithRepetition {

	public static void main(String[] args) {
		int[] arr= {3,9,9,2,1,18,9};
		int target=9;
		System.out.println(search(arr,target,0,new ArrayList<Integer>()));
		System.out.println(search2(arr,target,0));
	}
	

	private  static ArrayList<Integer> search(int[] arr, int target,int index,ArrayList<Integer> ans) {
		if(arr[index]==target)
			ans.add(index);
		if(index>=arr.length-1)
			return ans;
		return search(arr, target, index+1,ans);
	}
	
	//Without passing Arraylist
	private static ArrayList<Integer> search2(int[] arr, int target, int index) {
		ArrayList<Integer> ans=new ArrayList<Integer>();
		if(arr[index]==target)
			ans.add(index);
		if(index>=arr.length-1)
			return ans;
		ArrayList<Integer> StoringAnswerFromabove= search2(arr, target, index+1);
		ans.addAll(StoringAnswerFromabove);
		return ans;
	}
}
