package Recursion;

public class linearSearch {

	public static void main(String[] args) {
		int[] arr= {3,2,1,18,9};
		int target=128;
		System.out.println(search(arr,target,0));
		System.out.println(search2(arr,target,0));

	}

	private static int search(int[] arr, int target,int index) {
		if(arr[index]==target)
			return index;
		if(index>=arr.length-1)
			return -1;
		return search(arr, target, index+1);
	}
	
	private static boolean search2(int[] arr, int target,int index) {
		if(index>=arr.length-1)
			return false;
		return (arr[index]==target) || search2(arr, target, index+1);
	}

}
