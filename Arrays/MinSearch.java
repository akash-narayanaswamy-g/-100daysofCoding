package ArrayProblems;

public class MinSearch {

	public static void main(String[] args) {
		int[] arr= {88,99,7,5,66,22,33,77};
		System.out.println(min(arr));

	}
	
	static int min(int[] a) {
		int min=a[0];
		for (int n : a) {
			if(min>n)
				min=n;
		}
		return min;
	}

}
