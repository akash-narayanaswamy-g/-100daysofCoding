package ArrayProblems;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,44,55,66,77,88,99,9,76,54,67,12,45};
		int t=100;
		int k=Linear_s(arr, t);
		
		if (k==-1)
			System.out.println("Element not pesent");
		else
			System.out.println("Index : "+k);
		

	}
	
	public static int Linear_s(int[] ar,int target) {
		if(ar.length==0)
			return -1;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==target)
				return i;
			
		}
		return -1;
	}

}
