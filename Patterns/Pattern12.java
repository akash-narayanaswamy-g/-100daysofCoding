package Patterns;

/*
      
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

 */

public class Pattern12 {

	public static void main(String[] args) {

		int n=5;
		for (int row = 0; row < 2 * n; row++) {
			int totalColsInRow = row > n ? 2 * n - row: row;
			int noOfSpaces = n - totalColsInRow;
			for (int s = 0; s < noOfSpaces; s++) {
			System.out.print(" ");
			}
			for (int col = 0; col < totalColsInRow; col++) {
			System.out.print("* ");
			}
			System.out.println();
			}
		
	}

}
