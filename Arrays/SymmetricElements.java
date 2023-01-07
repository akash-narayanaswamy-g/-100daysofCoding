package ArrayProblems;

public class SymmetricElements {

	public static void main(String[] args) {
		int[][] arr= {
				{3,4},{1,2},{5,2},{7,10},{4,3},{2,5}
		};
		symmetricCheck(arr);

	}
	
	static void symmetricCheck(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][0]==arr[j][0] && arr[i][1]==arr[j][1]) {
					System.out.println("("+arr[i][0]+","+arr[i][1]+")");
				}
			}
			
		}
	}

}
