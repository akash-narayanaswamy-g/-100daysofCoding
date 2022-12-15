package Patterns;

/*
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
 */

public class Pattern11 {

	public static void main(String[] args) {
		int c=9;
		int n=5;
		for (int i = 0; i < n; i++) {
			for(int k=0;k<i;k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=c; j++) {
				System.out.print("* ");
			}
			System.out.println();
			c-=2;
			

	}

	}}
