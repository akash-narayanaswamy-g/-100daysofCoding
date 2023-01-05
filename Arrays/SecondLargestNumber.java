package ArrayProblems;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] arr= {10, 5, 10};
		System.out.println(print2largest(arr, arr.length));

	}
	
	static int print2largest(int arr[], int n) {
		if(arr.length < 2) return -1;

	    int first = -1;
	    int second = -1;

	    for(int value : arr) {
	        if(value > first) {
	            second = first;
	            first = value;

	        } else if(value > second && value != first) {
	            second = value;
	        }
	    }
	    return second;

    }

}
